
package com.dz.controller;

import com.dz.model.Book;
import com.dz.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    /**
     * to add the book
     */
    @RequestMapping(value = "/addbook/")
    public String addBook(Model model) {
        Book book = new Book();
        model.addAttribute("book", book);
        return "addbook";
    }

    @RequestMapping(value = "/addbook")
    public ModelAndView saveNewBook(@ModelAttribute("book") Book book) {
        bookService.addBook(book);
        return new ModelAndView("redirect:/viewbook");
    }
}

