package com.company.consolcalc.console;

import com.company.consolcalc.Application;
import com.company.consolcalc.service.Calculator;

import static com.company.consolcalc.console.ConsoleWriter.*;
import static com.company.consolcalc.console.ConsoleReader.*;
import static com.company.consolcalc.console.SMSWriter.*;

public class ConsoleApplication implements Application {


    @Override
    public void run() {
        while (true) {
            writeString("Welcome ");
            double num1 = getNumber("Enter number 1");
            double num2 = getNumber("Enter number 2");
            String operation = chooseOperation("Enter operation: sum, sub, mul, div");

            double result = Calculator.calc(num1, num2, operation);

            sendMessage("+375 44 7899878","Result = " + result);

            if (isExit()) break;
        }
    }

    private double getNumber(String m){
        writeString(m);
        return readDouble();
    }

    private String chooseOperation(String m){
        writeString(m);
        return readString();
    }

    private boolean isExit(){
        writeString("Exit?");
        String s = readString();
        return s.equalsIgnoreCase("y");
    }

}
