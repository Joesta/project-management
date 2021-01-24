package za.co.robusttech.pma.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import za.co.robusttech.pma.dto.IEmployeeProjectCount;
import za.co.robusttech.pma.entities.Employee;

public interface IEmployeeRepository extends CrudRepository<Employee, Long> {

	@Override
	public List<Employee> findAll();

	@Query(nativeQuery = true, value = "SELECT e.first_name AS firstName, e.last_name AS lastName, COUNT(e.employee_id) AS projectCount "
			+ "FROM employee e LEFT JOIN project_employee pe ON e.employee_id = pe.employee_id "
			+ "GROUP BY e.first_name, e.last_name ORDER BY 3 DESC")
	public List<IEmployeeProjectCount> getEmployeeProjectCount();
}
