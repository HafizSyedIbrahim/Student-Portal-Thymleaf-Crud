package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Student.Student;
import com.example.demo.Student.StudentRepository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
//	@Autowired
//	public StudentRepository studentRepo;
//	
//	public void run(String... args) throws Exception{
//	
//		Student student = new Student("Ali",1,1,"LHR");
//		studentRepo.save(student);
//	}
	

}
