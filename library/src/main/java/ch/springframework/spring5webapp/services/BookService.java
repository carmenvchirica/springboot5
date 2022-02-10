package ch.springframework.spring5webapp.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ch.springframework.spring5webapp.entities.Book;
import ch.springframework.spring5webapp.repositories.BookRepository;

@Service
public class BookService {
	private final static Logger log = LoggerFactory.getLogger(BookService.class.getName());

	private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public Book save(Book book) { 
		book.setTitle("Mindset");
		book.setIsbn("53HDB2UUJ");
		log.info("Save: " + book.toString());
		return bookRepository.save(book);
	}
}
