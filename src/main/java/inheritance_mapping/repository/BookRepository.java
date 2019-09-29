package inheritance_mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import inheritance_mapping.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
