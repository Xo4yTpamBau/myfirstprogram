package com.company;

import java.io.Console;
import java.io.IOException;

public class Calculator {
//    private int number;
//    private int number2;
//    private static String operation;

    private String[] history = new String[10];

//    public Calculator(int number, int number2, String operation) {
//        this.number = number;
//        this.number2 = number2;
//        this.operation = operation;
//    }

    //sum, sub, mul, div

    private void addResultToHistory(double result){
        for (int i = 0; i < history.length; i++) {
            if (history[i] == null){
                history[i] = "Result " + result;
                break;
            }
        }
    }

    public void showHistory(){
        for (int i = 0; i < history.length; i++) {
            if (history[i] == null) break;
            System.out.println(history[i]);
        }
    }

    public double calc(String operation, double... numbers){
        switch (operation){
            case "sum":
                double sum = sum(numbers);
                addResultToHistory(sum);
                return sum;
            case "sub":
                double sub = sub(numbers);
                addResultToHistory(sub);
                return sub;
            case "mul":
                double mul = mul(numbers);
                addResultToHistory(mul);
                return mul;
            case "div":
                double div = div(numbers);
                addResultToHistory(div);
                return div;
            case "cos":
                double cos = Math.cos(numbers[0]);
                addResultToHistory(cos);
                return cos;
        }
        return 0;
    }

    private double sum(double... numbers){
        double result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }

    private double sub(double... numbers){
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = result - numbers[i];
        }
        return result;

    }

    private double mul(double... numbers){
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = result * numbers[i];
        }
        return result;
    }

    private double div(double... numbers){
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = result / numbers[i];
        }
        return result;
    }

}
