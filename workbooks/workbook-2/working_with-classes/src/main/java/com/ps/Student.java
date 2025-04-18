package com.ps;

public class Student {
    // Properties
    private int studentId;
    private String name;
    private float currentGrade;
    private String seat;

    public Student(){}
    public Student(String name){
        this.name = name;
    }
    public Student(int studentId, String name, float currentGrade) {
        this.studentId = studentId;
        this.name = name;
        this.currentGrade = currentGrade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(float currentGrade) {
        this.currentGrade = currentGrade;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public void displayStudentDetails(){
        System.out.printf("");
    }

}
