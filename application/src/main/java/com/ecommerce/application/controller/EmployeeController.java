package com.ecommerce.application.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.application.domain.Employee;
import com.ecommerce.application.service.EmployeeService;



@RestController
@RequestMapping("/emp")
public class EmployeeController {
	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/getData")
	public List<Employee> getAllData() {
		return employeeService.getAllData();
	}
	
	@PostMapping(value="/add",produces="plain/text")
	public String addEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		log.info("Sucessfully inserted emplyee of id:{} into db",employee.getEmpid());
		return "**Sucessfully added emplyee into db**";
	}
}
