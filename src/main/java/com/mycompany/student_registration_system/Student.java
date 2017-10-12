package com.mycompany.student_registration_system;

import java.util.ArrayList;
import org.joda.time.LocalDate;
import org.joda.time.Years;

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
    private ArrayList<Module> modules;
    private Course course;
    //private String nextStudentId = null;
    private String studentId;
    private int age;
    private LocalDate DOB;

    public Student(String name, String studentId){
        this.name = name;
        this.studentId = studentId;
        LocalDate now = LocalDate.now();
       // age = Years.yearsBetween(DOB, now).getYears();

        modules = new ArrayList<Module>();
    }

    public String toString() {
        return "Name: " + this.name + " ID: " + this.studentId + " Username: " + this.getUserName();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setName(String n) {
        this.name = n;
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

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }
    
}
