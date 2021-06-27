package net.perscholas.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.perscholas.springboot.model.Student;
import net.perscholas.springboot.repository.StudentRepository;

@RestController
@RequestMapping("/api/v1/")

public class StudentController {
	
	@Autowired
	
	private StudentRepository studentRepository;
	
	//get all students
	
	@GetMapping("/student")
	public List <Student> getAllStudent(){
		return studentRepository.findAll();
	}

}
