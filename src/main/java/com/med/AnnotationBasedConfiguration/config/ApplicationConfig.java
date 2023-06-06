package com.med.AnnotationBasedConfiguration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.med.AnnotationBasedConfiguration.repositories.InMameryStudentRepository;
import com.med.AnnotationBasedConfiguration.repositories.StudentRepository;
import com.med.AnnotationBasedConfiguration.services.StudentService;
import com.med.AnnotationBasedConfiguration.services.StudentServiceImp;
import com.med.AnnotationBasedConfiguration.services.StudentServiceMock;

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
