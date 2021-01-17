package za.co.robusttech.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import za.co.robusttech.pma.dao.IEmployeeRepository;
import za.co.robusttech.pma.entities.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	IEmployeeRepository repository;

	@GetMapping("/new")
	public String employeFormData(Model model) {
		model.addAttribute("employee", new Employee());

		return "new-employee";
	}

	@PostMapping("/save")
	public String createEmployee(Employee employee, Model mode) {
		repository.save(employee);
		return "redirect:/employees/new";
	}
}
