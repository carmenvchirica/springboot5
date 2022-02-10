package ch.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.springframework.spring5webapp.entities.Author;
import ch.springframework.spring5webapp.services.AuthorService;

@Controller
@RequestMapping("/author")
public class AuthorController {

	private final AuthorService authorService;
	
	public AuthorController(final AuthorService authorService) {
		this.authorService = authorService;
	}

	@PostMapping("/save")
	public void saveAuthor() {
		Author author = new Author();
		authorService.save(author);
	}
}
