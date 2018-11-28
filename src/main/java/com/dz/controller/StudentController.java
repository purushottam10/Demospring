package com.dz.controller;


import com.dz.model.Student;
import com.dz.service.StudentService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/**
 * to config the path to the jsp pages
 */
@Controller
@RequestMapping("/")
public class StudentController {

    private final Logger log = LogManager.getLogger(StudentController.class.getName());

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    /**
     *
     * @return this will return at the index page when ever you start the server
     */
    @RequestMapping(value ={"/","index"})
    public String indexController() {


        log.info("return the index page ");

        return "index";
    }

    /**
     * to set the model attribute
     *
     * @param model to set the model
     * @return addstudent
     */
    @RequestMapping("addstudent")
    public String addProduct(Model model) {

        Student student = new Student();
        log.info("inside add Product");
        model.addAttribute("student", student);
        return "addstudent";
    }

    /**
     * to save data in DB
     * and send to the view  page
     */
    @RequestMapping(value = "addstudent", method = RequestMethod.POST)
    public ModelAndView saveStudent(@ModelAttribute("student") Student student) {
        log.info("this is printed by add  method");
        studentService.addStudent(student);
        return new ModelAndView("redirect:/viewstudent");
    }

    /**
     * to view the record of saved student List
     */
    @RequestMapping(value = {"viewstudent"})
    public ModelAndView viewStudentcont() {
        List<Student> studentList = studentService.viewStudent();
        if (!studentList.isEmpty()) {
            return new ModelAndView("viewstudent", "studentList", studentList);
        } else
            return new ModelAndView("index", "message", "no data Found in the table ");
    }

    @RequestMapping(value = "editstudent/{roll_no}")
    public String editStudent(@PathVariable("roll_no") int roll_no, Model model) {
        Student student = studentService.getStudentById(roll_no);
        model.addAttribute("student", student);
        return "editstudent";
    }

    /**
     * to edit the existing Record in data base
     */
    @RequestMapping(value = "editstudent", method = RequestMethod.POST)
    public ModelAndView eitStudentSave(@ModelAttribute Student student) {
        log.info("this is in the controller editStudentSave" + student.getRollNo());
        studentService.editRecord(student);
        return new ModelAndView("redirect:/viewstudent");
    }

    /**
     * to Delete the record from database
     */
    @RequestMapping(value = "deletestudent/{roll_no}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("roll_no") Integer roll_no) {
        log.info("this the id passed by JSP page " + roll_no);
        studentService.deleteRecord(roll_no);
        return new ModelAndView("redirect:/viewstudent");
    }


}
