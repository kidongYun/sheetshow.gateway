package com.kian.yun.sheetshow.gateway.config

import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.cloud.gateway.route.builder.routes
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RoutingConfig {
    private val memberModuleEndpoint: String = "http://localhost:8100/"
    private val sheetModuleEndpoint: String = "http://localhost:8200/"
    private val lyricrapingModuleEndpoint: String = "http://localhost:8300/"
    @Bean
    fun routeLocator(builder: RouteLocatorBuilder): RouteLocator = builder.routes {
        route {
            path("/api/v1/sheet/**")
            uri(sheetModuleEndpoint)
        }
        route {
            path("/api/v1/bar/**")
            uri(sheetModuleEndpoint)
        }
        route {
            path("/api/v1/fingering/**")
            uri(sheetModuleEndpoint)
        }
        route {
            path("/api/v1/note/**")
            uri(sheetModuleEndpoint)
        }
        route {
            path("/api/v1/member/**")
            uri(memberModuleEndpoint)
        }
        route {
            path("/api/v1/lyrics/**")
            uri(lyricrapingModuleEndpoint)
        }
    }
}