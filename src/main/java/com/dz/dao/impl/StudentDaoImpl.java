package com.dz.dao.impl;

import com.dz.dao.StudentDao;
import com.dz.model.Student;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * implement StudentDao class and provide the operations  of data base
 */
@EnableTransactionManagement(proxyTargetClass = true)
@Transactional
@Repository
class StudentDaoImpl implements StudentDao {

    /**
     * to make class singaltan
     */
    @Autowired
    SessionFactory sessionFactory;
    private final Logger log = LogManager.getLogger(StudentDao.class.getName());


    /**
     * to add the data in database
     *
     * @param student this receive the model attribute to the service
     */
    @Override
    public void addStudent(Student student) {
        log.info(student.getRollNo() + "  " + student.getName() + " " + student.getAge());

        try {

            Session session = sessionFactory.getCurrentSession();
            log.info("Session created but data not saved yet");
            session.saveOrUpdate(student);

        } catch (HibernateException e) {
            log.error(e.getMessage(), e);
            log.info("Session created but counter to exception ");
        }
    }

    /**
     * @return studentList this return studentList
     * to show the data from database table
     */
    @Override
    public List<Student> viewStudent() {


        log.info("this in the StudentDao View Method");
        try {
            Query query = sessionFactory.getCurrentSession().createQuery(" From Student");
            List<Student> studentList = query.list();
            return studentList;
        } catch (HibernateException e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }

    /**
     * @param rollNo this receive  the id to service
     * @return student return a single student
     */
    public Student getStudentById(int rollNo) {
        log.info("here is getStudentById");

        try {
            Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Student.class);
            criteria.add(Restrictions.eq("rollNo", rollNo));
            Student student = (Student) criteria.uniqueResult();
            log.info(student.getRollNo() + "  " + student.getName() + " " + student.getAge());
            return student;
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        return null;
    }

    /**
     * @param student this receive the param to the service
     */
    @Override
    public void editRecord(Student student) {
        log.info("id from controller" + student.getRollNo());
        log.info(student.getRollNo() + "  " + student.getName() + " " + student.getAge() + "gfghryh5djjjjjjjjjjjjjjj");
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(student);

    }

    /**
     * @param student this receive from service
     */
    @Override
    public void deleteRecord(Student student) {

        Session session = sessionFactory.getCurrentSession();
        session.delete(student);
    }
}
