package com.mycompany.student_registration_system;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MMC
 */
public class Module {
    
    private static int nextModuleId = 401;
    private String moduleCode, title;
    private ArrayList students;

    public Module(String title) {
        this.title = title;
        this.moduleCode = "CT " + nextModuleId;
        this.students = new ArrayList();
        nextModuleId++;
    }

    private String getModuleCode() {
        return this.moduleCode;
    }

    private String getTitle() {
        return this.title;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void setStudents(ArrayList<Student> s) {
        this.students = s;
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public String toString() {
        return "Module Code: " + this.moduleCode + " Title: " + this.title;
    }
    
}
