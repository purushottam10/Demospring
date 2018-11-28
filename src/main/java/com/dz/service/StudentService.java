package com.dz.service;

import com.dz.model.Student;

import java.util.List;

public interface StudentService {
    void addStudent(Student student);

    List<Student> viewStudent();

    void editRecord(Student student);

    void deleteRecord(int id);

    Student getStudentById(int roll_no);
}
