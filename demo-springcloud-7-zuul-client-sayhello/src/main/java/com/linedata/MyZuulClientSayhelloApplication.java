package com.linedata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MyZuulClientSayhelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyZuulClientSayhelloApplication.class, args);
	}
}
