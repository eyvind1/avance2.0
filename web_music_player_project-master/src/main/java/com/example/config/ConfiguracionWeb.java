package com.example.config;

import com.lyncode.jtwig.mvc.JtwigViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;



@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"controlador", "repositorio", "servicio"})
public class ConfiguracionWeb extends WebMvcConfigurerAdapter {

	@Bean
	public ViewResolver viewResolver() {
		JtwigViewResolver jtwigViewResolver = new JtwigViewResolver();
		jtwigViewResolver.setPrefix("/WEB-INF/views/");
		jtwigViewResolver.setSuffix(".twig.html");
		return jtwigViewResolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
			registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
		}

}