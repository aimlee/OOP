package com.company;

public class Student {
    public String name="empty";
    public int id;
    public int yos;
    private static int nextID =0;

    Student()
    {
        id = nextID++;
    }
    Student(String studentName, int yofs){
        this();
        name = studentName;
        yofs = yos;
    }


}
