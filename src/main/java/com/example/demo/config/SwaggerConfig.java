package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.ApiOperation;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

//    @Bean
//    public Docket swaggerSpringMvcPlugin() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
//                .build();
//    }

    /**
     * Swagger 通过注解表明该接口会生成文档，包括接口名、请求方法、参数、返回信息的等等。
     *
     * @Api：修饰整个类，描述 Controller 的作用
     * @ApiOperation：描述一个类的一个方法，或者说一个接口
     * @ApiParam：单个参数描述
     * @ApiModel：用对象来接收参数
     * @ApiProperty：用对象接收参数时，描述对象的一个字段
     * @ApiResponse：HTTP 响应其中 1 个描述
     * @ApiResponses：HTTP 响应整体描述
     * @ApiIgnore：使用该注解忽略这个API
     * @ApiImplicitParam：一个请求参数
     * @ApiImplicitParams：多个请求参数
     *
     * 以上这些就是最常用的几个注解了。
     * 具体其他的注解，查看：https://github.com/swagger-api/swagger-core/wiki/Annotations
     */

    @Bean
    public Docket api() {
        //http://localhost:8080/swagger-ui.html
        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    public static void main(String[] args) {
        final List list = new CopyOnWriteArrayList();
        for (int i = 0; i < 100; i++)
            list.add(i);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    while (true) {
                        System.out.println("size:"+list.get(list.size()-1));
                    }
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println(e.getCause());
                    System.out.println(e.getStackTrace().toString());
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    for (int i = 0; i < list.size(); i++){
                        System.out.println("pre:"+list.size());
                        list.remove(list.size() - 1);
                        System.out.println("later:"+list.size());
                    }
                }
            }
        }).start();

//        while (true) ;
    }

}
