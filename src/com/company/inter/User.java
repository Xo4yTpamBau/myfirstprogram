package com.company.inter;

public class User {

    public void sayResult(int a, int b, String operation, Calculation calculation) {
        int result = calculation.getResult(a, b, operation);
        System.out.println("Result = " + result);
    }

    public static void main(String[] args) {
        User user = new User();

        Calculation calculation = new CacheCalculator();

//        user.sayResult(2, 2, "sum", calculation);

        long start = System.nanoTime();
        user.sayResult(2, 2, "sum", calculation);
        long end = System.nanoTime();

        System.out.println(end - start);
    }
}
