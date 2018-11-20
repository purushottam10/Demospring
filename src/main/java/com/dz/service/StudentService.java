package com.dz.service;

import com.dz.model.Student;

public interface StudentService {
    public boolean addStudent(Student student);
    public void viewStudent();
    public boolean editRecord(Student student);
    public  boolean deleteRecord(int id);
}
