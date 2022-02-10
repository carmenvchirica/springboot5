package ch.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.springframework.spring5webapp.entities.Book;
import ch.springframework.spring5webapp.services.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
	
	private final BookService bookService;
	
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@PostMapping("/save")
	public void save() {
		Book book = new Book();
		bookService.save(book);
	}
}
