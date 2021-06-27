package com.company;

import com.company.test.User;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        User user = new User(22, "Test", "test", "test");
//        user.setAge(33);

        Фигура a = new Квадрат();
        Фигура a1 = new Круг();
        Фигура a2 = new Треугольник();
        a.рисовать();
        a1.рисовать();
        a2.рисовать();
    }
}
