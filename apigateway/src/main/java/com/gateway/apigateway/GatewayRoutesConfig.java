package com.gateway.apigateway;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayTestConfig {

    @Bean
    public RouteLocator testRoute(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("test_route", r -> r
                        .path("/test/**")
                        .uri("http://httpbin.org"))
                .build();
    }
}

