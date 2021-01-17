package za.co.robusttech.pma.dao;

import org.springframework.data.repository.CrudRepository;

import za.co.robusttech.pma.entities.Employee;

public interface IEmployeeRepository extends CrudRepository<Employee, Long>{

}
