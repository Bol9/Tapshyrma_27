package com.company;

public class Box extends Student{


    public Box(int id,String name) {
        super(id,name);
    }
    @Override
    public  void hello(){
        System.out.println("override");
    }



    public Box() {
    }




}
