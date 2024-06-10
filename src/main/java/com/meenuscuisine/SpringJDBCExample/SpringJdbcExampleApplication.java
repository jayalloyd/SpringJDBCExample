package com.meenuscuisine.SpringJDBCExample;

import com.meenuscuisine.SpringJDBCExample.model.Student;
import com.meenuscuisine.SpringJDBCExample.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
public class SpringJdbcExampleApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringJdbcExampleApplication.class, args);
        Student s= context.getBean(Student.class);
		s.setRollNo(1);
		s.setName("lloyd");
		s.setMarks(85);
        StudentService service=context.getBean(StudentService.class);
		service.addStudent(s);
		List<Student> students=service.getStudent();
		System.out.println(students);

	}

}
