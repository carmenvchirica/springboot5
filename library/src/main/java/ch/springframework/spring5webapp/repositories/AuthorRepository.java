package ch.springframework.spring5webapp.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.springframework.spring5webapp.entities.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, UUID> {
	
}
