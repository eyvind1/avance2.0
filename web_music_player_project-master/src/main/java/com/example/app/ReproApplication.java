package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Import;

import com.config.ConfiguracionWeb;
import com.example.dominio.BaseEntity;

@Import(ConfiguracionWeb.class)
@EnableAutoConfiguration
@EntityScan(basePackageClasses=BaseEntity.class)
public class ReproApplication {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ReproApplication.class, args);
	}
}