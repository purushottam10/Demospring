package com.dz.dao.impl;

import com.dz.dao.BookDao;
import com.dz.model.Book;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@EnableTransactionManagement(proxyTargetClass = true)
@Repository
@Transactional
public class BookDaoImpl implements BookDao {
    @Override
    public void addBook(Book book) {

    }

    @Override
    public List<Book> viewBook() {
        return null;
    }

    @Override
    public void editBookRecord(Book book) {

    }

    @Override
    public void deleteBookRecord(Book book) {

    }

    @Override
    public Book getBookById(int bookId) {
        return null;
    }
}
