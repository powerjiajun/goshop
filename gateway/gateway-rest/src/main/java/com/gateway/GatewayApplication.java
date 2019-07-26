package com.gateway;

import com.gateway.filter.AccessGatewayFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Mono;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

	@Bean
	public RouteLocator customerRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(r -> r.path("/API/**")
						.filters(f -> f.stripPrefix(1)
								.filter(new AccessGatewayFilter())
								.addResponseHeader("X-Response-test", "test"))
						.uri("lb://API")
						.order(0)
						.id("test_consumer_service")
				)
				.build();
	}

//	@Bean
//	public RouteLocator routeLocator(RouteLocatorBuilder builder) {
//		return builder.routes().route(r ->
//				r.path("/API/**")
//						//转发路由
//						.uri("lb://API")
//						//注册自定义过滤器
//						.filters(new AccessGatewayFilter())
//						//给定id
//						.id("user-service"))
//				.build();
//	}



}
