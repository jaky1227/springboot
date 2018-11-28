package com.zlf.springboot.learning.chap6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Value(value = "${swagger.enabled}")
    Boolean swaggerEnabled;


    @Bean
    public Docket createReseApi(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .enable(swaggerEnabled).select()
                .apis(RequestHandlerSelectors.basePackage("com.zlf.springboot.learning.chap6"))
                .paths(PathSelectors.any()).build().pathMapping("/");
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("swagger demo").build();
    }
}
