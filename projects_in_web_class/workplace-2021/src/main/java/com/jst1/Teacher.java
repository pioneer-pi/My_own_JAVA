package com.jst1;

import com.example06.Course;

import java.util.List;

public class Teacher {
    private int id;
    private String name;
    private List<Course> courses;
    private Title title;

    public Teacher(int id, String name, Title title,List<Course> courses) {
        this.id = id;
        this.name = name;
        this.courses = courses;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }
}
