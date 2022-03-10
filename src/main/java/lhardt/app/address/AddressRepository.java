package lhardt.app.address;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
	@Query("SELECT addr FROM Address addr")
    List<Address> findAll();

	@Query("SELECT addr FROM Address addr WHERE id=:id")
    List<Address> findById(@Param("id") long id);

}
