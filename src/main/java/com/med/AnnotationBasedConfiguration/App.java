package com.med.AnnotationBasedConfiguration;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.med.AnnotationBasedConfiguration.config.ApplicationConfig;
import com.med.AnnotationBasedConfiguration.models.Student;
import com.med.AnnotationBasedConfiguration.repositories.StudentRepository;
import com.med.AnnotationBasedConfiguration.services.StudentService;


public class App
{
    public static void main( String[] args )
    {

        // Create the application context using the configuration class
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);


        // Check if the "studentrepo" bean is present in the context
        System.out.println(context.containsBean("studentrepo"));


        // Get the StudentService bean from the context
        StudentService studentService = context.getBean("Mockstudentservice", StudentService.class);

        // Display information for student with ID = 1
        studentService.DesplayStudent(1);
        System.out.println("---------------------------");


        // Display information for student with ID = 2
        studentService.DesplayStudent(2);
        System.out.println("---------------------------");

        // Create a new student with name "Jack" and ID = 3
        studentService.createStudent("Jack", "jack", 3);


        // Display the information of the newly created student (ID = 3)
        studentService.DesplayStudent(3);

        System.out.println("********************************");


        // Retrieve and display students whose first names start with "A" from the database
        StudentRepository studentRepository = context.getBean("studentrepo", StudentRepository.class);
        List<Student> students = studentRepository.findAllStudentNameStartWithA();

        for (Student student : students) {
            System.out.println("FirstName: " + student.getFirstname());
            System.out.println("LastName: " + student.getLastname());
            System.out.println("ID: " + student.getId());
        }
    }
}




