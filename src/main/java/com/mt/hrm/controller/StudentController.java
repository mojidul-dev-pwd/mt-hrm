package com.mt.hrm.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mt.hrm.exception.ResourceNotFoundException;
import com.mt.hrm.model.Employee;
import com.mt.hrm.model.StudentInformation;
import com.mt.hrm.repository.StudentRepository;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/students")
	public List<StudentInformation> GetAllEmployee(){
		return studentRepository.findAll();
	}
	
	@GetMapping("/students/{id}")
	public ResponseEntity<StudentInformation> getStudentInformationById(@PathVariable(value="id") Integer studentId) throws ResourceNotFoundException {
		StudentInformation student = studentRepository.findById(studentId)
				.orElseThrow(() -> new ResourceNotFoundException("Student not found for this id :: " + studentId));
		return ResponseEntity.ok().body(student);
	}
	
	@PostMapping("/students")
	public StudentInformation createStudentInformation(@Valid @RequestBody StudentInformation student) {
		return studentRepository.save(student);
	}
	
}
