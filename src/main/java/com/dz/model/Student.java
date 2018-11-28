package com.dz.model;

import java.io.Serializable;

/**
 * Model class to access  the model object
 */
public class Student implements Serializable {
    private int rollNo;
    private String name;
    private int age;

    /**
     * @return rool_no
     */
    public int getRollNo() {
        return rollNo;
    }

    /**
     * @param rollNo
     */
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }
}
