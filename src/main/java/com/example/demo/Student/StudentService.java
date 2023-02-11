package com.example.demo.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class StudentService {
	@Autowired
	StudentRepository StudentRepo;
	
	public List<Student> getAllStudents() {	
		List<Student> students = new ArrayList<>();
		StudentRepo.findAll().forEach(students::add);
		return students;
	}
	
	public Student saveStudents(Student student) {
		return StudentRepo.save(student);
		
	}
	
	
	public Student getStudentById(String id) {
		return StudentRepo.findById(id).get();
	}

	
	public Student updateStudent(Student student) {
		return StudentRepo.save(student);
	}

	
	public void deleteStudentById(String id) {
		StudentRepo.deleteById(id);	
	}
	
}
