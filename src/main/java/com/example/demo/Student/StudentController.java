package com.example.demo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	// Handler method to handle list of students and return Model and View.
	
	@GetMapping("/students")
	public String getAllStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		// create student object to hold student form data
		Student student = new Student();
		model.addAttribute("student", student);
		return "createStudent";
		
	}
	
	@PostMapping("/students")
	public String saveStudents(@ModelAttribute("student") Student student) {
		
		studentService.saveStudents(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable String id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}

	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable String id,@ModelAttribute("student") Student student, Model model) {
		
		// get student from database by id
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setName(student.getName());
		existingStudent.setSalary(student.getSalary());
		existingStudent.setAddress(student.getAddress());
		
		// save updated student object
		studentService.saveStudents(existingStudent);
		return "redirect:/students";	
}
	
	// handler method to handle delete student request
	
		@GetMapping("/students/{id}")
		public String deleteStudent(@PathVariable String id) {
			studentService.deleteStudentById(id);
			return "redirect:/students";
		}	

}
