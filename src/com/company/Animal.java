package com.company;

public abstract class Animal {
    private String type;

    public Animal(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void sayHello();

    public static void main(String[] args) {
        Animal dog = new Dog("test", "test");
        Cat cat = new Cat("test");
        dog.sayHello();
        cat.sayHello();
        cat.test();
    }

}
