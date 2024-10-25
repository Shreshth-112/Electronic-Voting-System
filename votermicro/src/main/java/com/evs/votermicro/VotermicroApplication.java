package com.evs.votermicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VotermicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(VotermicroApplication.class, args);
	}

}
