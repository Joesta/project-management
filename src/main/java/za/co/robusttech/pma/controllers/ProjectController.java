package za.co.robusttech.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import za.co.robusttech.pma.dao.IEmployeeRepository;
import za.co.robusttech.pma.dao.IProjectRepository;
import za.co.robusttech.pma.entities.Employee;
import za.co.robusttech.pma.entities.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {

	@Autowired
	IProjectRepository projectRepo;

	@Autowired
	IEmployeeRepository employeeRepo;

	@GetMapping("/new")
	public String displayProjectForm(Model model) {
		List<Employee> employees = employeeRepo.findAll();

		model.addAttribute("project", new Project());
		model.addAttribute("allEmployees", employees);

		return "projects/new-project";
	}

	@PostMapping("/save")
	public String createProject(Project project, Model model) {
		projectRepo.save(project);

		// redirect to prevent duplicate submissions
		return "redirect:/projects/new";
	}

	@GetMapping
	public String getProjects(Model model) {
		List<Project> projects = projectRepo.findAll();
		model.addAttribute("projects", projects);
		return "projects/view-projects";
	}

}
