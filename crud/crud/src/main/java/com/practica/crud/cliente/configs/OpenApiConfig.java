package com.practica.crud.cliente.configs;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
        @Bean
        public GroupedOpenApi apiGroup() {
                return GroupedOpenApi.builder()
                        .group("clientes-api")
                        .pathsToMatch("/api/clientes/**")
                        .build();
        }

        @Bean
        public io.swagger.v3.oas.models.OpenAPI customOpenAPI() {
                return new io.swagger.v3.oas.models.OpenAPI()
                        .info(new Info()
                                .title("API de Gestión de Clientes")
                                .version("1.0")
                                .description("Documentación de la API para gestionar clientes")
                                .contact(new Contact().name("Edgar Jardón Torres").email("edgar.jardon@hotmail.com")));
        }
}
