package com.med.AnnotationBasedConfiguration.repositories;

import java.util.ArrayList;
import java.util.List;

import com.med.AnnotationBasedConfiguration.models.Student;

public class InMameryStudentRepository implements StudentRepository {

	ArrayList<Student> students=new ArrayList<Student>() ;



	public void save(Student s) {
		students.add(s);
	}

	public Student findById(long id) {

		for(Student s : students){
			if(s.getId()==id){
				return s;
			}
		}

		return null;
	}



	public List<Student> findAllStudentNameStartWithA() {

		List<Student> studentsFirstNameStartWithA=new ArrayList<Student>();

		for(Student s : students){
              if(s.getFirstname().startsWith("A")){
            	  studentsFirstNameStartWithA.add(s);
              };
		}

		return studentsFirstNameStartWithA;
	}

}
