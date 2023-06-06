package com.med.AnnotationBasedConfiguration.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.InitializingBean;

import com.med.AnnotationBasedConfiguration.models.Student;
import com.med.AnnotationBasedConfiguration.repositories.StudentRepository;

public class StudentServiceMock implements StudentService,InitializingBean{

	StudentRepository studentrepo;

	List<Student> students =new ArrayList<Student>(){{
		add(new Student("Mohammed","mohammed",1));
		add(new Student("Davide","davide",2));
        add(new Student("Anny","Anny",3));
        add(new Student("Amine","Amine",4));
		}};


	public void afterPropertiesSet() throws Exception {

		for(Student s: students){
			studentrepo.save(s);
		}
	}

	public StudentServiceMock(StudentRepository studentrepo) {
		this.studentrepo=studentrepo;
	}

	public Student FindStudentById(long id) {
		return studentrepo.findById(id);
	}

	public void DesplayStudent(long id) {
		Student student= studentrepo.findById(id);
		System.out.println(student.getFirstname());
		System.out.println(student.getLastname());
		System.out.println(student.getId());
	}

	public Student createStudent(String firstname, String lastname, long id) {
		Student s= new Student(firstname,lastname,id);
		studentrepo.save(s);
		return s;
	}





}
