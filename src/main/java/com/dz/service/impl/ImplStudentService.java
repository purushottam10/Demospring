package com.dz.service.impl;

import com.dz.dao.StudentDao;
import com.dz.model.Student;
import com.dz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImplStudentService implements StudentService {


    private ImplStudentService(){

    }
    @Autowired
    private StudentDao studentDao;

    @Override
    public void addStudent(Student student) {

         studentDao.addStudent(student);
    }
    //end method

    /**
     *
     */
    @Override
    public List<Student> viewStudent() {
        return studentDao.viewStudent();
    }//method end

    /**
     * @param student this receive the student model
     */

    @Override
    public void editRecord(Student student) {

        studentDao.editRecord(student);
    }//method end

   public  Student getStudentById(int id){
        return studentDao.getStudentById(id);
   }
    /**
     *
     * @param id this receive the student id
     */
    @Override
    public void deleteRecord(int id) {

         studentDao.deleteRecord(id);
    }//method end
}
