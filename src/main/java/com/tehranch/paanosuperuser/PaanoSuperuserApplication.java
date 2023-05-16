package com.tehranch.paanosuperuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaanoSuperuserApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaanoSuperuserApplication.class, args);
	}

}
