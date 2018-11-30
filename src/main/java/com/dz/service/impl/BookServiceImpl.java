package com.dz.service.impl;

import com.dz.dao.BookDao;
import com.dz.model.Book;
import com.dz.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private final BookDao bookDao;

    @Autowired
    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    @Override
    public List<Book> viewBook() {
        return bookDao.viewBook();
    }

    @Override
    public void editBookRecord(Book book) {
        bookDao.editBookRecord(book);
    }

    @Override
    public void deleteBookRecord(Book book) {
        bookDao.deleteBookRecord(book);

    }

    @Override
    public Book getBookById(int bookId) {
        return bookDao.getBookById(bookId);
    }
}
