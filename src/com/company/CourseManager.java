package com.company;

public class CourseManager {
    public void complateCourse(Course course){
        course.isCompleted = true;
        System.out.println(course.name + "kursunu tamamladınız.");
    }
    public void joinCourse(Course course){
        System.out.println(course.name + "kursuna katıldınız.");
    }

}
