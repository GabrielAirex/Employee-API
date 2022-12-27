package com.synchro.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.synchro.api.models.Employee;
import com.synchro.api.repository.EmployeeRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(value="/api")
@Api(value="API REST Employees")
@CrossOrigin(origins="*")

public class EmployeeController {
	@Autowired
	EmployeeRepository repository;
	
	@GetMapping("/employee")
	@ApiOperation(value="Return a list of all employees")
	public List<Employee> getAllEmployee(){
		return repository.findAll();
	}
	
	@GetMapping("/employee/{id}")
	@ApiOperation(value="Return a employee by ID")

	public Employee getEmployeeById(@PathVariable (value="id") long id ) {
		return repository.findById(id);
	}
	
	@PostMapping("/employee")
	@ApiOperation(value="Return a new employee")
	public Employee saveEmployee( @RequestBody Employee employee) {
		return  repository.save(employee) ;
	}
	
	@DeleteMapping("/employe/{id}")
	@ApiOperation(value="Delete a employee by ID")
	public void deleteEmployee(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	
	@DeleteMapping("/employee")
	@ApiOperation(value="Delete a employee if your put same data")
	public void deleteEmployee(@RequestBody Employee employee) {
		repository.delete(employee);
	}
	
	@PutMapping("/employee")
	@ApiOperation(value="Edit a employee")

	public Employee editEmployee(@RequestBody Employee employee) {
		return repository.save(employee);
	}
	

}
