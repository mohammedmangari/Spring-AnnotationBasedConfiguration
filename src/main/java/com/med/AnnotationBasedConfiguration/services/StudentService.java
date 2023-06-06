package com.med.AnnotationBasedConfiguration.services;

import com.med.AnnotationBasedConfiguration.models.Student;

public interface StudentService {
	Student  createStudent(String firstname,String lastname ,long id);
	Student FindStudentById(long id);
	void  DesplayStudent(long id);
}
