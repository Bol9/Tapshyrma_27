package com.company;

public class Student {
    private int id=12;
    private String name;

    protected void hello(){

        System.out.println(name+" Hello");
    }

    public Student(int id, String name) {
        this.id = id;
        this.name=name;

    }

    public Student() {
    }
}

