package com.dz.dao;

        import com.dz.model.Student;

        import java.util.List;

public interface StudentDao {
    void addStudent(Student student);

    List<Student> viewStudent();

    void editRecord(Student student);

    void deleteRecord(int id);

    Student getStudentById(int id);
}
