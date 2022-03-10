package lhardt.app.school;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {
	@Query("SELECT sch FROM School sch")
    List<School> findAll();

	@Query("SELECT sch FROM School sch WHERE id=:id")
    List<School> findById(@Param("id") long id);

}
