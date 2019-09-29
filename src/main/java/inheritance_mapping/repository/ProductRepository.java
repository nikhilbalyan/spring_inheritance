package inheritance_mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import inheritance_mapping.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
