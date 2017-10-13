package com.mycompany.student_registration_system;

import java.util.ArrayList;
import org.joda.time.DateTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MMC
 */
public class Student {
    
    private String name;
    private DateTime DOB;
    private String studentId;
    private Course course;
    private ArrayList<Module> modules;

    public Student(String name, String studentId){
        this.name = name;
        this.studentId = studentId;

        modules = new ArrayList<Module>();
    }
    
    public void setName(String n) {
        this.name = n;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getUserName() {
        return this.name + this.studentId;
    }

    public Course getCourse() {
        return course;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public DateTime getDOB() {
        return DOB;
    }

    public void setDOB(DateTime DOB) {
        this.DOB = DOB;
    }
    
    @Override
    public String toString() {
        return "Name: " + this.name + " ID: " + this.studentId + " Username: " + this.getUserName();
    }
    
}
