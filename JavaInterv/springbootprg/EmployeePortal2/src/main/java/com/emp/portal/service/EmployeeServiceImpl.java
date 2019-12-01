package com.emp.portal.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.portal.model.Employee;
import com.emp.portal.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository empRepository;
	
	@Override
	public Employee registerEmp(Employee emp) {
		return empRepository.save(emp);
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> ls = empRepository.findAll();
		Collections.sort(ls,(e1,e2) -> e1.getFirstName().compareToIgnoreCase(e2.getFirstName()));
		return ls;
	}

}
