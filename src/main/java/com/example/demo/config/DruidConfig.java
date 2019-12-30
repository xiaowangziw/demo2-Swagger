package com.example.demo.config;


import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.alibaba.druid.support.spring.stat.DruidStatInterceptor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.JdkRegexpMethodPointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Druid监控配置
 */
@Configuration
public class DruidConfig {
    @Value("${druid.spring.monitor.separator}")
    private String separator;

    @Value("${druid.spring.monitor.pattern}")
    private String patternStr;

    /**
     * 必须配置数据源，不然无法获取到sql监控，与sql防火墙监控
     *
     * @return
     */
    @Bean(name = "default_databaseSource")
//    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource() {
        //Druid 数据源配置
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/world?serverTimezone=UTC&characterEncoding=utf8&useUnicode=true&useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        //初始连接数(默认值0)
        dataSource.setInitialSize(8);
        //最小连接数(默认值0)
        dataSource.setMinIdle(8);
        //最大连接数(默认值8,注意"maxIdle"这个属性已经弃用)
        dataSource.setMaxActive(32);
        return dataSource;
    }

    @Bean
    public ServletRegistrationBean druidServlet() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(new StatViewServlet());
        servletRegistrationBean.addUrlMappings("/druid/*");
        Map<String, String> initParameters = new HashMap<>(3);
        initParameters.put("loginUsername", "admin");
        initParameters.put("loginPassword", "admin");
        initParameters.put("resetEnable", "false");
        servletRegistrationBean.setInitParameters(initParameters);
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }

    @Bean
    public DruidStatInterceptor druidStatInterceptor() {
        DruidStatInterceptor bean = new DruidStatInterceptor();
        return bean;
    }

    @Bean
    @Scope("prototype")
    public JdkRegexpMethodPointcut druidStatPointcut() {
        JdkRegexpMethodPointcut pointcut = new JdkRegexpMethodPointcut();
        if (StringUtils.isNotBlank(patternStr)) {
            String[] patterns = patternStr.split(separator);
            pointcut.setPatterns(patterns);
        }
        return pointcut;
    }

    @Bean
    public DefaultPointcutAdvisor druidStatAdvisor(DruidStatInterceptor druidStatInterceptor, JdkRegexpMethodPointcut druidStatPointcut) {
        DefaultPointcutAdvisor defaultPointAdvisor = new DefaultPointcutAdvisor();
        defaultPointAdvisor.setPointcut(druidStatPointcut);
        defaultPointAdvisor.setAdvice(druidStatInterceptor);
        return defaultPointAdvisor;
    }
}