package com.jst1;

import com.example06.Course;

import java.util.Date;
import java.util.List;

public class DatabaseUtils {
    private static final List<Course> COURSES = createCourses();
    private static final List<Title> TITLES = createTitles();
    private static List<Course> createCourses(){
        Course c1 = new Course(1,"Java程序设计","Java-1",new Date());
        Course c2 = new Course(3,"Web开发技术","Web",new Date());
        Course c3 = new Course(4,"数据库原理","Database",new Date());
        Course c4 = new Course(7,"系统分析与设计","System", new Date());
        return List.of(c1,c2,c3,c4);
    }
    public static List<Course> ListCourse(){
        return COURSES;
    }
    public static Course getCourse(int id){
        return COURSES.stream()
                .filter(c->c.getId() == id)
                .findFirst()
                .orElse(null);
    }
    public static List<Title> createTitles(){
        Title t1 = new Title(1,"讲师");
        Title t2 = new Title(2,"副教授");
        Title t3 = new Title(3,"教授");
        return List.of(t1,t2,t3);
    }
    public static Title getTitle(int id){
        return TITLES.stream()
                .filter(t->t.getId() == id)
                .findFirst()
                .orElse(null);
    }
    public static List<Title> ListTitles(){ return TITLES;}
}
