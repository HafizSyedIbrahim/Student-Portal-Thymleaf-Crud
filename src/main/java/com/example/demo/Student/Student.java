package com.example.demo.Student;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")

public class Student {

	@Id
	private String id;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	String name;
	String salary;
	String Address;
	
// Default Constructor;
	
	Student(){
		
	}
	
// Parametrized Constructor	
	public Student(String _name, String _id, String _salary, String _Address){
		
		this.name = _name;
		this.id = _id;
		this.salary = _salary;
		this.Address = _Address;
	}
	
	public void setName(String _name) {
		this.name = _name;
	}
	
	public String getName() {	
		return name;
	}
	
	public void setId(String _id) {
		this.id = _id;
	}
	
	public String getId() {
		
		return id;
	}
	
	public void setSalary(String _salary) {
		this.salary = _salary;
	}
	
	public String getSalary() {
		
		return salary;
	}
	
	public void setAddress(String _Address) {
		this.Address = _Address;
	}
	
	public String getAddress() {
		
		return Address;
	}
}
