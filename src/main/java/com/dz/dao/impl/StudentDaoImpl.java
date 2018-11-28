package com.dz.dao.impl;

import com.dz.dao.StudentDao;
import com.dz.model.Student;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * implement StudentDao class and provide the operations  of data base
 */

@Transactional
@Repository
class StudentDaoImpl implements StudentDao {

    /**
     * to make class singaltan
     */
    @Autowired
    private StudentDaoImpl(JdbcTemplate template) {

        this.template = template;
    }

    private final Logger log = LogManager.getLogger(StudentDao.class.getName());
    private final JdbcTemplate template;


    /**
     * to add the data in database
     *
     * @param student this receive the model attribute to the service
     */
    @Override
    public void addStudent(Student student) {

        String sql = "insert into student (ID,name,age) values('" + student.getRollNo() + "','" + student.getName() + "','" + student.getAge() + "')";
        template.update(sql);
    }

    /**
     * @return studentList this return studentList
     * to show the data from database table
     */
    @Override
    public List<Student> viewStudent() {


        log.info("this in the StudentDao View Method");
        return template.query("Select * from student", (ResultSet resultSet) -> {
                    log.info("in the Result set applied the lambda Expression ");
                    List<Student> studentList = new ArrayList<>();
                    while (resultSet.next()) {
                        Student student = new Student();
                        student.setRollNo(resultSet.getInt(1));
                        student.setName(resultSet.getString(2));
                        student.setAge(resultSet.getInt(3));
                        studentList.add(student);
                    }
                    return studentList;
                }
        );

    }

    /**
     * @param id this receive  the id to service
     * @return student return a single student
     */
    public Student getStudentById(int id) {
        log.info("here is getStudentById");
        return template.queryForObject("SELECT id as rollNo, name, age from student  WHERE id=? ", new Object[]{id}, new BeanPropertyRowMapper<>(Student.class));

    }

    /**
     * @param student this receive the param to the service
     */
    @Override
    public void editRecord(Student student) {
        log.info("id from controller" + student.getRollNo());
        String sql= "update student set name='" + student.getName() + "',age=" + student.getAge() + " where ID=" + student.getRollNo() + "";
        log.info("message" + sql);
        template.update(sql);
    }

    /**
     * @param id this receive from service
     */
    @Override
    public void deleteRecord(int id) {

        String sql = "DELETE FROM student WHERE ID=" + id + "";
        template.update(sql);
    }
}