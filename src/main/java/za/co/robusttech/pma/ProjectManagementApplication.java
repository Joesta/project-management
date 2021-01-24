 package za.co.robusttech.pma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ProjectManagementApplication {
		
//	@Autowired
//	IEmployeeRepository employeeRepo;
//	
//	@Autowired
//	IProjectRepository projectRepo;


	public static void main(String[] args) {
		SpringApplication.run(ProjectManagementApplication.class, args);
	}
	
//	@Bean 
//	CommandLineRunner runner() {
//		return args -> {
//			// data to seed
//			
//			// employees
//			Employee emp1 = new Employee("Joesta", "Sebolela", "joestax@icloud.com");
//			Employee emp2 = new Employee("Tshegofatso", "Sebolela", "tshego@gmail.com");
//			Employee emp3 = new Employee("Karabo", "Sebolela", "karabo@icloud.com");
//			Employee emp4 = new Employee("Bohlale", "Sebolela", "bojlale@icloud.com");
//			Employee emp5 = new Employee("Neo", "Sebolela", "neo@yahoo.com");
//			
//			// project
//			Project proj1 = new Project("Android", "Food delivery app", "COMPLETED");
//			Project proj2 = new Project("Flutter", "Find My Taxi app", "NOTSTARTED");
//			Project proj3 = new Project("Critical", "Must be prioterized","STARTED");
//			Project proj4 = new Project("Not Important", "Ignore", "NOTSTARTED");
//			Project proj5 = new Project("Vital", "Should be started soon", "INPROGRESS");
//			Project proj6 = new Project("IONIC", "Parking tracker", "COMPLETED");
//			
//			emp1.setProject(Arrays.asList(proj1, proj2, proj3, proj6));
//			emp2.setProject(Arrays.asList(proj2, proj4));
//			emp3.setProject(Arrays.asList(proj1, proj2, proj5));
//			emp2.setProject(Arrays.asList(proj2, proj5));
//			emp5.setProject(Arrays.asList(proj5, proj3));
//			
//			proj1.setEmployees(Arrays.asList(emp1, emp2, emp3));
//			proj4.setEmployees(Arrays.asList(emp2));
//			proj3.setEmployees(Arrays.asList(emp1, emp4, emp5));
//			
//			employeeRepo.save(emp1);
//			employeeRepo.save(emp2);
//			employeeRepo.save(emp3);
//			employeeRepo.save(emp4);
//			employeeRepo.save(emp5);
////		
//			projectRepo.save(proj1);
//			projectRepo.save(proj2);
//			projectRepo.save(proj3);
//
//			
//		};
//	}

}
