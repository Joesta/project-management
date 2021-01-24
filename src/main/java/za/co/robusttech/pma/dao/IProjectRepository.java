package za.co.robusttech.pma.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import za.co.robusttech.pma.dto.IChartData;
import za.co.robusttech.pma.entities.Project;

public interface IProjectRepository extends CrudRepository<Project, Long>{
	
	@Override
	public List<Project> findAll();
	
	@Query(nativeQuery = true, value = "SELECT stage AS label, COUNT(*) AS value "
			+ "FROM project "
			+ "GROUP BY stage")
	public List<IChartData> getProjectStatus();
}
