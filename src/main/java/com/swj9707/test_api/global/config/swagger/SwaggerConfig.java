package com.swj9707.test_api.global.config.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openApi() {
        Info info = new Info()
                .title("Test API Server Docs").version("v1.0.0")
                .description("Spring Boot 기초 셋업 스터디 교육자료");

        return new OpenAPI().info(info);

    }
}
