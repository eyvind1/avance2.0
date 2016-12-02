package com.example;

import com.example.config.ConfiguracionWeb;
import com.example.dominio.BaseEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;

import com.example.dominio.Usuario;
import org.springframework.context.annotation.Import;

@Import(ConfiguracionWeb.class)
@EnableAutoConfiguration
@EntityScan(basePackageClasses = BaseEntity.class)
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
