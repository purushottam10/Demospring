package com.dz.service;

import com.dz.model.Book;

import java.util.List;


public interface BookService {
    void addBook(Book book);

    List<Book> viewBook();

    void editBookRecord(Book book);

    void deleteBookRecord(Book book);

    Book getBookById(int bookId);

}
