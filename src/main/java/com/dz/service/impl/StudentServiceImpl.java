package com.dz.service.impl;

import com.dz.dao.StudentDao;
import com.dz.model.Student;
import com.dz.service.StudentService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final Logger log = LogManager.getLogger(StudentDao.class.getName());

    private StudentServiceImpl(){

    }
    @Autowired
    private StudentDao studentDao;

    @Override
    public void addStudent(Student student) {

         studentDao.addStudent(student);
    }


    /**
     *
     */
    @Override
    public List<Student> viewStudent() {
        return studentDao.viewStudent();
    }

    /**
     * @param student this receive the student model
     */

    @Override
    public void editRecord(Student student) {
        log.info(student.getRollNo() + "  " + student.getName() + " " + student.getAge() + "service tilll");
        studentDao.editRecord(student);
    }

    public Student getStudentById(int rollNo) {

        return studentDao.getStudentById(rollNo);
   }
    /**
     *
     * @param student this receive the student id
     */
    @Override
    public void deleteRecord(Student student) {

        studentDao.deleteRecord(student);
    }
}
