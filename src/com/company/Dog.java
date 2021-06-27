package com.company;

public class Dog extends Animal {
    private String name;

    public Dog(String type, String name) {
        super(type);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void sayHello() {
        System.out.println("Dog");
    }
}
