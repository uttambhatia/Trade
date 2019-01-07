package com.tmt.namingserver.tmteurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TmtEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmtEurekaNamingServerApplication.class, args);
	}

}

