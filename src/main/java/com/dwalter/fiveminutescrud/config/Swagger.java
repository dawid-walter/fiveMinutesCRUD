package com.dwalter.fiveminutescrud.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class Swagger {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(apiInfo());
    }

    private Info apiInfo() {
        return new Info().title("Five minutes CRUD REST API")
                .version("v0.0.1")
                .license(new License().name("Apache 2.0").url("http://springdoc.org"))
                .contact(contact());
    }

    private Contact contact() {
        Contact contact = new Contact();
        contact.name("Dawid Walter");
        return contact;
    }
}
