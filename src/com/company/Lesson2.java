package com.company;

public class Lesson2 {
    public static void main(String[] args) {
        int a = 854393214;

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
}



//        int b = a;

//        boolean flag = true;
//        for (int i = a; i > 0; ) {
//            int c = i % 10;
//            i = i / 10;
//            for (int j = i; j > 0 ; j = j / 10) {
//                int cc = j % 10;
//                if (c == cc){
//                    flag = false;
//                }
//            }
//        }
//
//       if (flag){
//           System.out.println(true);
//       }

//        int max = a % 10;
//        int min = a % 10;
//
//        for (int i = a; i > 0; i = i / 10) {
//            if ((i % 10) > max){
//                max = i % 10;
//            }
//            if ((i % 10) < min) {
//                min = i % 10;
//            }
//        }
//           System.out.println(max);
//            System.out.println(min);

//        int i = a % 10;
//        int i1 = a / 10;
//        int i2 = i1 % 10;

//        System.out.println(i2);

