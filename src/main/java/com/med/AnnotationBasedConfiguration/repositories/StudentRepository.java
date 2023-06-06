package com.med.AnnotationBasedConfiguration.repositories;

import java.util.List;

import com.med.AnnotationBasedConfiguration.models.Student;

public interface StudentRepository {
	void save(Student s);
	Student findById(long id);
    List<Student> findAllStudentNameStartWithA();

}
