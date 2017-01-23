package com.hudongwx.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Springboot1Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Springboot1Application.class);
	}

	public static void main(String[] args) {
		System.out.println("==================项目启动 9999============================");
		SpringApplication.run(Springboot1Application.class, args);
		System.out.println("==================项目完成 9999============================");
	}


}
