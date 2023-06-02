package com.med.AnnotationBasedConfiguration;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App
{
    public static void main( String[] args )
    {

    	 ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

    	 System.out.println(context.containsBean("studentrepo"));

    	 StudentService studentservice= context.getBean("Mockstudentservice",StudentService.class);

    	 // ID =1 => desplay :  Mohammed mohammed 1
    	 studentservice.DesplayStudent(1);
    	 System.out.println("---------------------------");

    	 // ID 2 => desplay : Davide davide 2
    	 studentservice.DesplayStudent(2);

    	 System.out.println("---------------------------");

    	 // Creat new student : Jack jack 3
    	 studentservice.createStudent("Jack", "jack", 5);


    	 // Desplay the information of the student that  we have created  (id=3)

    	 studentservice.DesplayStudent(3);


      System.out.println("********************************");

      //Display the students where their first names start with "A" stored in the database

    	 StudentRepository studentrepo = context.getBean("studentrepo",StudentRepository.class);

    	  List<Student> students = studentrepo.findAllStudentNameStartWithA();

    	  for(Student s : students){
    		  System.out.println("FirstName: "+ s.getFirstname());
    		  System.out.println("LastName: "+ s.getLastname());
    		  System.out.println("id: "+ s.getId());
    	  }











    }
}
