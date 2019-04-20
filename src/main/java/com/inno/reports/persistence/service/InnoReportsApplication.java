package com.inno.reports.persistence.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories("com.inno.reports.persistence.service.repository")
public class InnoReportsApplication {

	public static void main(String[] args) {
		SpringApplication.run(InnoReportsApplication.class, args);
	}


}
