package com.med.AnnotationBasedConfiguration;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceImp implements StudentService  {


	private StudentRepository studentrepo;

	public StudentServiceImp(StudentRepository studentrepo) {
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
