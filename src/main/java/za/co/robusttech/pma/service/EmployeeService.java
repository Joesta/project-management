package za.co.robusttech.pma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.robusttech.pma.dao.IEmployeeRepository;

@Service
public class EmployeeService {
	 
	
	// field injection
	@Autowired
	IEmployeeRepository employeeRepo;
	
//	// constructor injection
//	EmployeeService(IEmployeeRepository employeeRepo) {
//		super();
//		this.employeeRepo = employeeRepo;
//	}

	// setter injection
	@Autowired
	public void setEmployeeRepo(IEmployeeRepository employeeRepo) {
		this.employeeRepo = employeeRepo;
	}
}
