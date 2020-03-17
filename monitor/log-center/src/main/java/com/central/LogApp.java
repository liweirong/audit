package com.central;

import com.central.search.annotation.EnableSearchClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author iris
 */
@EnableDiscoveryClient
@EnableSearchClient
@SpringBootApplication
@EnableEurekaClient
public class LogApp {
	public static void main(String[] args) {
		SpringApplication.run(LogApp.class, args);
	}
}
