package com.gateway.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayRoutesConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()

                // USER SERVICE
                .route("USER-SERVICE", r -> r
                        .path("/api/users/**")
//                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://USER-SERVICE")
                )

                // HOTEL SERVICE
                .route("HOTEL-SERVICE", r -> r
                        .path("/api/hotels/**")
//                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://HOTEL-SERVICE")
                )

                // RATING SERVICE
                .route("RATING-SERVICE", r -> r
                        .path("/api/rating/**")
//                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://RATING-SERVICE")
                )

                .build();
    }
}
