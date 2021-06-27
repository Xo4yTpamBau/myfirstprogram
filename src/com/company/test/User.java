package com.company.test;


//public
//protected
//package-private
//private
public class User {
    private int age;
    private String name;
    private String login;
    private String password;

    public User(int age, String name, String login, String password) {
        this.age = age;
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public void sayHello() {
        System.out.println("Hello my name " + name);
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) {
        User user = new User(22, "Test", "test", "test");
        User user2 = new User(44, "Test 2", "test2", "test2");
        User user3 = new User(11, "Test 3", "test3", "test3");

        user.name = "jkjk";

        int sum = user3.sum(4, 5);

        System.out.println(sum);
    }

}
