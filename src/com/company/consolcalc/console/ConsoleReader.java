package com.company.consolcalc.console;

import java.util.Scanner;

public class ConsoleReader {

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String next = scanner.nextLine();
//
//        System.out.println(next);
//    }

    public static String readString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static int readInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static double readDouble() {
        Scanner scanner = new Scanner(System.in);
        return  scanner.nextDouble();
    }
}
