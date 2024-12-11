package com.deber.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import com.google.common.base.Predicate;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
public class SwaggerController {

	
	@Bean
	public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                    .title("API de Gestión Médica")
                    .version("1.0")
                    .description("Documentación de la API de Gestión de Citas Médicas")
                    .contact(new Contact()
                        .name("Soporte Técnico")
                        .email("soporte@example.com")
                        .url("http://example.com")));
    }
	
}

