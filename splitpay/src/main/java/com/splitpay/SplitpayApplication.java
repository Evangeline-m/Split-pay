package com.splitpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class SplitpayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SplitpayApplication.class, args);
	}

//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//		return new WebMvcConfigurerAdapter() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				
//				
//				registry.addMapping("/signup").allowedOrigins("http://localhost:4200");
//				registry.addMapping("/signup").allowCredentials(true);
//				
//				registry.addMapping("/signin").allowedOrigins("http://localhost:4200");
//				registry.addMapping("/signin").allowCredentials(true);
//			}
//		};
//	}
}
