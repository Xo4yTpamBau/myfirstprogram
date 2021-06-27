package com.company;

public class NumberService {

    public static void main(String[] args) {
        NumberService numberService = new NumberService();
        numberService.printAscDigits(456765);
    }

    void printAscDigits(int a){
        for (int i = a; i > 0; ) {
            int c = (i % 10) ;
            int b =0;
            i = i / 10;
            for (int j = i; j > 0; j = j / 10 ) {
                int cc = j % 10;
                c = c + 1;
                if (c  == cc) {
                    b = b + 1;
                    if (b == 1) {
                        System.out.print(cc-b);
                        System.out.print(c);
                    } else {
                        System.out.print(c);}
                }
                else{
                    System.out.println();
                    break;}
            }
        }
    }

    boolean duplicate(int a) {
        int b = a;

        boolean flag = true;
        for (int i = a; i > 0; ) {
            int c = i % 10;
            i = i / 10;
            for (int j = i; j > 0; j = j / 10) {
                int cc = j % 10;
                if (c == cc) {
                    flag = false;
                }
            }
        }

        if (flag) {
            return flag;
        }
        return false;
    }

    void printReverseDigits(int a){
        for (int i = a; i > 0; i = i / 10){
            System.out.print(i%10);
        }
    }

    void printMinAndMax(int a) {
        int max = a % 10;
        int min = a % 10;

        for (int i = a; i > 0; i = i / 10) {
            if ((i % 10) > max) {
                max = i % 10;
            }
            if ((i % 10) < min) {
                min = i % 10;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }


}


