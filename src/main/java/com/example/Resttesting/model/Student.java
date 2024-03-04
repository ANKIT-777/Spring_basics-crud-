package com.example.Resttesting.model;

public class Student {
    private String name;
    private Integer roll;
    private String subject;
    private Integer rank;

    public Student(){

    }

    public Student(String name, Integer roll, String subject, Integer rank) {
        this.name = name;
        this.roll = roll;
        this.subject = subject;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }
}
