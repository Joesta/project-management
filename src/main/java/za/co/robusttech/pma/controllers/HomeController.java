package za.co.robusttech.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import za.co.robusttech.pma.dao.IEmployeeRepository;
import za.co.robusttech.pma.dao.IProjectRepository;
import za.co.robusttech.pma.entities.Employee;

@Controller
public class HomeController {
	
	@Autowired
	IProjectRepository projectRepo;
	
	@Autowired
	IEmployeeRepository employeeRepo;
	
//	@GetMapping("/")
//	public String displayHome(Model model) {
//		List<Project> projects = projectRepo.findAll();
//		model.addAttribute("projects", projects);
//		return "home";
//	}
	
	@GetMapping("/")
	public String displayHome(Model model) {
		List<Employee> employees = (List<Employee>) employeeRepo.findAll();
		model.addAttribute("employees", employees);
		return "main/home";
	}
}
