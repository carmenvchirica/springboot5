package ch.springframework.spring5webapp;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import ch.springframework.spring5webapp.entities.Author;
import ch.springframework.spring5webapp.entities.Book;
import ch.springframework.spring5webapp.services.AuthorService;
import ch.springframework.spring5webapp.services.BookService;

@SpringBootTest
class Tests {
	private final static Logger log = LoggerFactory.getLogger(Tests.class.getName());
	
	private final AuthorService authorService;
	private final BookService bookService;
	
	public Tests(AuthorService authorService, BookService bookService) {
		this.authorService = authorService;
		this.bookService = bookService;
	}

	@Test
	void contextLoads() {
		log.info("----- Start Testing ------");
		Author author = new Author();
		author.setFirstName("Carol S.");
		author.setLastName("Dweck");
		
		Set<Author> authors = new HashSet<Author>();
		authors.add(authorService.save(author));
		
		Book book1 = new Book( "Mindset", "F74HEC12S", authors);
		Set<Book> books = new HashSet<Book>();
		
		books.add(bookService.save(book1));
		author.setBooks(books);
	}

}
