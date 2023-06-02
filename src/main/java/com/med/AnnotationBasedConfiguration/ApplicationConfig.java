package com.med.AnnotationBasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationConfig {

	@Bean
	public StudentService studentservice(){
		return new StudentServiceImp(studentrepo());
	}

	@Bean
	public StudentService Mockstudentservice(){
		return new StudentServiceMock(studentrepo());
	}

	@Bean
	@Scope("singleton")
	public StudentRepository studentrepo(){
		return new InMameryStudentRepository();
	}




}
