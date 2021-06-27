package com.company;

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        int[] a = new int[]{4, 4554, 4, 2, 3, 474, 5, 3, 678876, 57};
        int count = 0;
//        int aa = 0;


        // TODO: 25.09.2020 Реализовать удаление дубликатов в массиве

//        for (int i = 0; i < a.length; i++) {
//            for (int i1 = i+1; i1 < a.length; i1++){
//                if (a[i] == a[i1]) {
//                    count ++;
//                    aa = a[a.length-count];
//                    a[a.length-count]=0;
//                    a[i1]=aa;
 //                   a[i1] = 0;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(a));

//        int count = 0;
 //      for (int i = a.length - 1; i > 0; i--) {
//           for (int i1 = 0; i1 < i; i1++) {
//                count++;
//               if (a[i1] > a[i1 + 1]) {
 //                   int aa = a[i1];
//                  a[i1] = a[i1 + 1];
 //                   a[i1 + 1] = aa;
 //              }
 //           }
//        }
       //       System.out.println(count);
 //       System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            int aa = a[i];
            int bb = 0;
            if (aa > 9){
                while (aa > 0){
                    int ost = aa % 10;
                    aa = aa / 10;
                    bb = bb + ost;
                    bb = bb * 10;
                }
                bb = bb / 10;
                if (bb == a[i]){
                    System.out.println(a[i]);
                }
            }
        }


//        boolean flag = false;
//        for (int i = 0; i < a.length - 1; i++) {
//            if ((a[i] + 1) == a[i + 1]) {
//                System.out.println(a[i]);
//                if (i == a.length - 2){
//                    System.out.println(a[a.length-1]);
//                }
//                flag = true;
//            }
//            if (flag) {
//                if ((a[i] + 1) != a[i + 1]) {
//                    System.out.println(a[i]);
//                    flag = false;
//                }
//            }
//        }

//        int min = a[0];
//        int max = a[0];
//        for (int i = 0; i < a.length; i++) {
//            if (a[i]<0) a[i]=a[i]*-1;
//            int aa = a[i];
//            if (aa>max)
//                max=aa;
//            if (aa<min)
//                min=aa;
//        }
//        System.out.println(max);
//        System.out.println(min);

//        for (int i = 0; i < a.length; i++) {
//            if (a[i]%2==0) {
//                System.out.println("Even = " + a[i]);
//            } else {
//                System.out.println("Odd = " + a[i]);
//            }
//
//
//        }


//        int min = a[0];
//        int max = a[0];
//        for (int i = 0; i < a.length; i++) {
//            int aa = a[i];
//            if (aa>max)
//                max=aa;
//            if (aa<min)
//                min=aa;
//
//        }
//
//        System.out.println(min);
//        System.out.println(max);
    }
}
