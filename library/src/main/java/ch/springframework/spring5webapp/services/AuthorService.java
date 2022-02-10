package ch.springframework.spring5webapp.services;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ch.springframework.spring5webapp.entities.Author;
import ch.springframework.spring5webapp.entities.Book;
import ch.springframework.spring5webapp.repositories.AuthorRepository;
import ch.springframework.spring5webapp.repositories.BookRepository;

@Service
public class AuthorService {

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;

	public AuthorService(AuthorRepository authorRepository, BookRepository bookRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}

	public Author save(Author author) {
		author.setFirstName("Carol S.");
		author.setLastName("Dweck");
		
		Set<Author> authors = new HashSet<Author>();
		authors.add(authorRepository.save(author));
		
		Book book1 = new Book("Mindset", "F74HEC12S", authors);
		Set<Book> books = new HashSet<Book>();
		
		books.add(bookRepository.save(book1));
		author.setBooks(books);
		return authorRepository.save(author);
	}

}
