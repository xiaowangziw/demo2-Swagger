package com.example.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

/**
 * 资源服务器配置
 * 资源服务器（可以与授权服务器或单独的应用程序相同）为受 OAuth2 令牌保护的资源提供服务。
 * Spring OAuth 提供了一个实现这种保护的 Spring Security 认证过滤器。
 * 您可以在 Configuration 类上使用 @EnableResourceServer 将其打开，并使用 ResourceServerConfigurer 对其进行配置（如有必要）。
 */
@Configuration
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true)//激活方法上的PreAuthorize注解
public class Oauth2ResourceServerConfig extends ResourceServerConfigurerAdapter {

 //公钥     
 private static final String PUBLIC_KEY = "publickey.txt";


    /**
     * 以下功能可以配置：
     *
     * tokenServices：定义令牌服务的 bean（ResourceServerTokenServices 的实例）。
     *
     * resourceId：资源的 id（可选，但是推荐，并且将由 auth 服务器验证，如果存在的话）。
     *
     * 资源服务器的其他扩展点（例如 tokenExtractor 用于从传入请求中提取令牌）
     *
     * 请求受保护资源的匹配器（默认为全部）
     *
     * 受保护资源的访问规则（默认为普通的"authenticated"）
     *
     * Spring Security 中 HttpSecurity 配置器所允许的受保护资源的其他自定义情况
     */
    @Override
    public void configure(ResourceServerSecurityConfigurer serverSecurityConfigurer){

    }
    /**
     * 资源服务配置
     * @param http
     * @throws Exception
     */
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .requestMatchers()
//                .antMatchers("/api/**");
//    }

    //Http安全配置，对每个到达系统的http请求链接进行校验
     @Override
     public void configure(HttpSecurity http) throws Exception {
        //所有请求必须认证通过
        http.authorizeRequests()
                .anyRequest()
                .authenticated();
     }


    //定义JwtTokenStore，使用jwt令牌     
//     @Bean
     public TokenStore tokenStore(JwtAccessTokenConverter jwtAccessTokenConverter) {
         return new JwtTokenStore(jwtAccessTokenConverter);
    }


    //定义JJwtAccessTokenConverter，使用jwt令牌
//     @Bean
     public JwtAccessTokenConverter jwtAccessTokenConverter() {
         JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
         converter.setVerifierKey(getPubKey());
        return converter;
     }

     /**
      *   获取非对称加密公钥 Key
      *   @return 公钥 Key
       */
     private String getPubKey(){
         Resource resource = new ClassPathResource(PUBLIC_KEY);
         try {
             InputStreamReader inputStreamReader = new  InputStreamReader(resource.getInputStream());
             BufferedReader br = new BufferedReader(inputStreamReader);
             return br.lines().collect(Collectors.joining("\n"));
         } catch (IOException ioe) {
             return null;
         }
     }

}