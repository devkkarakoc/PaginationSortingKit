package com.kkarakoc.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@EntityScan(basePackages = { "com.kkarakoc" })
@ComponentScan(basePackages = { "com.kkarakoc" })
@EnableJpaRepositories(basePackages = { "com.kkarakoc" })
@SpringBootApplication
public class PageableApplicationStarter {

	public static void main(String[] args) {
		SpringApplication.run(PageableApplicationStarter.class, args);
	}

}
