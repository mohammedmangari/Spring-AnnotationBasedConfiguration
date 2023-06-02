package com.med.AnnotationBasedConfiguration;

import java.util.List;

public interface StudentRepository {
	void save(Student s);
	Student findById(long id);
    List<Student> findAllStudentNameStartWithA();

}
