package com.company.inter;

public class CalculatorV1 implements Calculation {

    protected int sum(int a, int b) {
        return a + b;
    }

    protected int sub(int a, int b) {
        return a - b;
    }

    protected int div(int a, int b) {
        return a / b;
    }

    protected int mod(int a, int b) {
        return a * b;
    }

    @Override
    public int getResult(int a, int b, String type) {
        switch (type) {
            case "sum":
                return sum(a, b);
            case "sub":
                return sub(a, b);
            case "div":
                return div(a, b);
            case "mod":
                return mod(a, b);
        }
        return 0;
    }
}
