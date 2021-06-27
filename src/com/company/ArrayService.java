package com.company;

import java.util.Arrays;

public class ArrayService {
    //Вывеести мин и макс в массиве
    //Вывести чет и не чет числа
    //Вывести длинное и короткое число
    //Вывести те числа которые идет в порядке взр.
    //Вывести все числа палиндромы


    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] a = new int[]{24, 25, 54, 654, 12, 43, 1, 66};

        arrayService.printPalindromes(a);
    }

    void printMinAndMax(int[] a) {
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0)
                a[i] = a[i] * -1;
            int aa = a[i];
            if (aa > max)
                max = aa;
            if (aa < min)
                min = aa;
        }
        System.out.println(max);
        System.out.println(min);

    }


    void printEvenAndOdd(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("Even = " + a[i]);
            } else {
                System.out.println("Odd = " + a[i]);
            }


        }
    }


    void printLongAndShort(int[] a) {
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            int aa = a[i];
            if (aa > max)
                max = aa;
            if (aa < min)
                min = aa;

        }

        System.out.println(min);
        System.out.println(max);
    }

    void printAscendingOrder(int[] a) {

        boolean flag = false;
        for (int i = 0; i < a.length - 1; i++) {
            if ((a[i] + 1) == a[i + 1]) {
                System.out.println(a[i]);
                if (i == a.length - 2) {
                    System.out.println(a[a.length - 1]);
                }
                flag = true;
            }
            if (flag) {
                if ((a[i] + 1) != a[i + 1]) {
                    System.out.println(a[i]);
                    flag = false;
                }
            }
        }
    }

    void printPalindromes(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int aa = a[i];
            int bb = 0;
            if (aa > 9) {
                while (aa > 0) {
                    int ost = aa % 10;
                    aa = aa / 10;
                    bb = bb + ost;
                    bb = bb * 10;
                }
                bb = bb / 10;
                if (bb == a[i]) {
                    System.out.println(a[i]);
                }
            }
        }
    }


}

