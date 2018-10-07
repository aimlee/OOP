package com.company;


public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.info());
        Animal b = new Animal("Red");
        System.out.println(b.info());
        Dog c = new Dog();
        System.out.println(c.info());
        Dog d = new Dog(2);
        System.out.println(d.info());
    }
}


