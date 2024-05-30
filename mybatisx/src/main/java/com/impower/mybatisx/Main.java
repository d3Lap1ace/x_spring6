package com.impower.mybatisx;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.mybatis.spring.annotation.MapperScan;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @classname mybatisx
 * @Auther d3Lap1ace
 * @Time 29/5/2024 09:08 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@SpringBootApplication
@MapperScan(basePackages = "com.impower.mybatisx.mapper")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("hello-knife4j项目API")
                        .version("1.0")
                        .description("hello-knife4j项目的接口文档"));
    }

    @Bean
    public GroupedOpenApi userAPI() {
        return GroupedOpenApi.builder().group("用户信息管理").
                pathsToMatch("/user/**").
                build();
    }

    @Bean
    public GroupedOpenApi systemAPI() {
        return GroupedOpenApi.builder().group("产品信息管理").
                pathsToMatch("/product/**").
                build();
    }

}
