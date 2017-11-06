package com.hunter.mymicrouser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MyMicroUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyMicroUserApplication.class, args);
	}
}
