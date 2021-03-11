package com.example.consume_apis;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger.web.SecurityConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo())
                .enable(true)
                .securityContexts(Lists.newArrayList(securityContext()))
                .securitySchemes(Lists.newArrayList(apiKey()));
    }


    private ApiInfo getApiInfo() {
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("T24 REST API")
                .description("REST API for Core Banking T24.")
                .termsOfServiceUrl("Terms of service Url")
                .contact(new Contact("Afriland First Bank", "https://www.afrilandfirstbank.com", "fintech_api@afrilandfirstbank.com"))
                .license("Afriland First Bank License Version 1.0")
                .licenseUrl("\"https://www.afrilandfirstbank.com")
                .version("1.0")
                .build();
        return apiInfo;
    }


    private ApiKey apiKey() {
        return new ApiKey("Authorization", "Authorization", "header");
    }

    @Bean
    public SecurityConfiguration security() {
        return SecurityConfigurationBuilder.builder().clientId(null).clientSecret(null).realm(null).appName(null).scopeSeparator(",").additionalQueryStringParams(null).useBasicAuthenticationWithAccessCodeGrant(false).build();
    }


    private SecurityContext securityContext() {
        return SecurityContext.builder().securityReferences(defaultAuth()).forPaths(PathSelectors.any()).build();
    }


    private ArrayList<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return Lists.newArrayList(new SecurityReference("Authorization", authorizationScopes));
    }
}
