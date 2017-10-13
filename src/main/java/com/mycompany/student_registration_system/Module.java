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
    
    private String moduleName;
    private ArrayList students;

    public Module(String moduleName) {
        this.moduleName = moduleName;
        this.students = new ArrayList();
    }

    public void addStudent(Student s) {
        students.add(s);
    }
    
    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public void setStudents(ArrayList<Student> s) {
        this.students = s;
    }

    @Override
    public String toString() {
        return "Module Name: " + this.moduleName;
    }
    
}
