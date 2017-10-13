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
    
    private ArrayList modules;
    private String title, courseCode;
    private DateTime startDate, endDate;
    private ArrayList<Student> students;

    public Course(String title, String courseCode, DateTime start, DateTime end) {
        this.title = title;
        this.startDate = start;
        this.endDate = end;
        this.courseCode = courseCode;
        modules = new ArrayList();
        students = new ArrayList<Student>();
    }

    public void addModule(Module m){
        modules.add(m);
    }

    public void registerStudent(Student s) {
        students.add(s);
        s.setCourse(this);
        s.setModules(modules);

        for(Module m : s.getModules()) {
            m.addStudent(s);
        }
    }

    public String toString() {
        return "Coursecode: " + courseCode + " Title: " + title;
    }

    public ArrayList getModules() {
        return modules;
    }

    public void setModules(ArrayList modules) {
        this.modules = modules;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    
}
