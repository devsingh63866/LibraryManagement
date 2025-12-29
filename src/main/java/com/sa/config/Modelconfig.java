package com.sa.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Modelconfig {
							
	@Bean							
	public ModelMapper modelMapper() {
		
		return new ModelMapper();
		
	}
}
