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
public class Course {
    
    private String courseName, courseCode;
    private DateTime startDate, endDate;
    private ArrayList<Student> students;
    private ArrayList modules;

    public Course(String courseName, String courseCode, DateTime start, DateTime end) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.startDate = start;
        this.endDate = end;
        modules = new ArrayList();
        students = new ArrayList<Student>();
    }

    public void addModule(Module module){
        modules.add(module);
    }

    public void registerStudent(Student s) {
        students.add(s);
        s.setCourse(this);
        s.setModules(modules);

        for(Module m : s.getModules()) {
            m.addStudent(s);
        }
    }
    
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList getModules() {
        return modules;
    }

    public void setModules(ArrayList modules) {
        this.modules = modules;
    }
    
    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
    
    @Override
    public String toString() {
        return "Course Name: " + courseName;
    }
    
}