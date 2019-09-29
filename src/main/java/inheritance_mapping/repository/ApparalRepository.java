package inheritance_mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import inheritance_mapping.model.Apparal;

@Repository
public interface ApparalRepository extends JpaRepository<Apparal, Long>{

}
