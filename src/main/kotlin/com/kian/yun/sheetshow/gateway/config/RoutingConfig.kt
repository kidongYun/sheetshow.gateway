package com.kian.yun.sheetshow.gateway.config

import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.cloud.gateway.route.builder.routes
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RoutingConfig {
    private val memberModuleUri: String = "http://localhost:8100/"
    private val sheetModuleUri: String = "http://localhost:8200/"
    @Bean
    fun routeLocator(builder: RouteLocatorBuilder): RouteLocator = builder.routes {
        route {
            path("/api/v1/sheet/**")
            uri(sheetModuleUri)
        }
        route {
            path("/api/v1/bar/**")
            uri(sheetModuleUri)
        }
        route {
            path("/api/v1/fingering/**")
            uri(sheetModuleUri)
        }
        route {
            path("/api/v1/note/**")
            uri(sheetModuleUri)
        }
        route {
            path("/api/v1/member/**")
            uri(memberModuleUri)
        }
    }
}