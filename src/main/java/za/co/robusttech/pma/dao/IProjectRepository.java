package za.co.robusttech.pma.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import za.co.robusttech.pma.entities.Project;

public interface IProjectRepository extends CrudRepository<Project, Long>{
	
	@Override
	public List<Project> findAll();
}
