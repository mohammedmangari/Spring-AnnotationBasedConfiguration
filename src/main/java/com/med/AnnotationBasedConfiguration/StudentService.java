package com.med.AnnotationBasedConfiguration;

public interface StudentService {
	Student  createStudent(String firstname,String lastname ,long id);
	Student FindStudentById(long id);
	void  DesplayStudent(long id);
}
