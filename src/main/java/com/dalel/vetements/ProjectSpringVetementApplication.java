package com.dalel.vetements;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.example.vetements.VetementsDemoApplication;
import com.example.vetements.entities.Vetement;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.vetements")
public class ProjectSpringVetementApplication {

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(VetementsDemoApplication.class, args);
	}

	public void run(String... args) throws Exception {
	repositoryRestConfiguration.exposeIdsFor(Vetement.class);
	}
	@Bean
	public ModelMapper modelMapper()
	{
	return new ModelMapper();
	}
}
