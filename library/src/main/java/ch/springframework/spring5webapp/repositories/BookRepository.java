package ch.springframework.spring5webapp.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.springframework.spring5webapp.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, UUID>{
	
}
