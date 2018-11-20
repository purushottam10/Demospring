package com.dz.dao;

import com.dz.model.Student;

import java.util.List;

public interface StudentDao {
    boolean addStudent(Student student);

    List<Student> viewStudent();

    boolean editRecord(Student student);

    boolean deleteRecord(int id);
}
