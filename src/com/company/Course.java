package com.company;

public class Course {
    public Course(String name, String detail, int days, String teacher, String category, boolean isCompleted){
        this.name = name;
        this.detail = detail;
        this.days = days;
        this.teacher = teacher;
        this.category = category;
        this.isCompleted = isCompleted;
    }

    String name;
    String detail;
    int days;
    String teacher;
    String category;
    boolean isCompleted;
}
