package za.co.robusttech.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import za.co.robusttech.pma.dao.IEmployeeRepository;
import za.co.robusttech.pma.dao.IProjectRepository;
import za.co.robusttech.pma.dto.IChartData;
import za.co.robusttech.pma.dto.IEmployeeProjectCount;
import za.co.robusttech.pma.entities.Project;

@Controller
public class HomeController {
	
	@Value("${version}")
	private String version;

	@Autowired
	IProjectRepository projectRepo;

	@Autowired
	IEmployeeRepository employeeRepo; 

	@GetMapping("/")
	public String displayHome(Model model) throws JsonProcessingException {
		
		List<IEmployeeProjectCount> employeeProjectCount = employeeRepo.getEmployeeProjectCount();

		List<Project> projects = projectRepo.findAll();

		List<IChartData> projectStatus = projectRepo.getProjectStatus();
		
		// convert project data into JSON
		ObjectMapper mapper = new ObjectMapper();
		
		String strProjectStatusCount = mapper.writeValueAsString(projectStatus);
		System.out.printf("%s\n\n", strProjectStatusCount);
		
		
		model.addAttribute("versionNumber", version);
		model.addAttribute("strProjectStatusCount",strProjectStatusCount);
		model.addAttribute("employeeProjectCount", employeeProjectCount);
		model.addAttribute("projects", projects);
		model.addAttribute("projectStatus", projectStatus);

		return "main/home";
	}
}
