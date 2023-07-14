package com.script;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.ui.ModelMap;

@SpringBootApplication
@EnableAspectJAutoProxy
public class ScriptApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(ScriptApplication.class, args);
	}

	@Bean
	public ModelMapper modelmaper()
	{
		return new ModelMapper(); 
	}
	
}
