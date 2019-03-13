package de.fnortheim.spring5webapp.controllers;

import de.fnortheim.spring5webapp.model.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by sebastianbasner on Mar, 2019
 */
@Controller
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) { // model gets injected by Spring
        // fetches books from the database and adds them to the model which will be passed to the view
        model.addAttribute("books", bookRepository.findAll());

        return "books"; // the thymeleaf view name
    }
}
