package za.co.robusttech.pma.dao;

import org.springframework.data.repository.CrudRepository;

import za.co.robusttech.pma.entities.Project;

public interface IProjectRepository extends CrudRepository<Project, Long>{
	
}
