package com.dz.dao.impl;

import com.dz.dao.StudentDao;
import com.dz.model.Student;

/**
 * implement StudentDao class and provide the operations  of data base
 */
   class implStudentDao implements StudentDao {

    /**
     * to add the data in database
     * @param Student
     * @return true if data inserted in table
     */
    @Override
     boolean addStudent(Student student) {


        return false;
    }//method end

    /**
     * to show the data from database table
     */
    @Override
     List<Student> viewStudent(){


        return  null;
    }//method end

    /**
     *
     * @return
     * @return
     */
    @Override
     boolean editRecord(Student student){

        return false;
    }//method end

    /**
     *
     * @return
     * @return
     */
    @Override
   boolean deleteRecord(int id ){

        return  false;
    }//method end
}
//class end