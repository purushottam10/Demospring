package com.dz.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;
    private String bookName;
    private String bookAuther;
    private int bookQuaqntity;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "Student", joinColumns = {@JoinColumn(name = "rollNo")})
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuther() {
        return bookAuther;
    }

    public void setBookAuther(String bookAuther) {
        this.bookAuther = bookAuther;
    }

    public int getBookQuaqntity() {
        return bookQuaqntity;
    }

    public void setBookQuaqntity(int bookQuaqntity) {
        this.bookQuaqntity = bookQuaqntity;
    }
}
