package za.co.robusttech.pma.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import za.co.robusttech.pma.entities.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {
	
	@GetMapping("/new")
	public String displayProjectForm(Model model) {
		model.addAttribute("project", new Project());
		return "new-project";
	}
	
	@PostMapping("/save")
	public String createProject(Project project, Model model) {
		// handles saving to the database
		return null;
	}
	
	
	
	
}
