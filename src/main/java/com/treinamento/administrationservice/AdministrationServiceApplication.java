package com.treinamento.administrationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages = { "com.treinamento.administrationservice.entity" })
@EnableJpaRepositories(basePackages = { "com.treinamento.administrationservice.repository" })
@ComponentScan(basePackages = {"com.treinamento.*"})
@EnableTransactionManagement
@EnableAsync
@EnableZuulProxy
public class AdministrationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdministrationServiceApplication.class, args);
	}

}
