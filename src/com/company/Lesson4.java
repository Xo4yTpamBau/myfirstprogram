package com.company;

import java.util.Arrays;

public class Lesson4 {

    public static void main(String[] args) {
        int[][] a = new int[5][5];

        for (int i = 0; i < a.length; i++) {
            for (int i1 = 0; i1 < a[i].length; i1++) {
                if (i1 <= i)
                    a[i][i1]++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int i1 = 0; i1 < a[i].length; i1++) {
              if (a[i][i1] == 1)
                  System.out.print(a[i][i1] + " ");
            }
            System.out.println();
        }


//        System.out.print("Hello ");
//        System.out.print("World");

        //1
        //1 1
        //1 1 1
        //1 1 1 1
        //1 1 1 1 1

//        for (int i = 0; i < a.length; i++)
//            for (int i1 = 0; i1 < a[i].length; i1++) {
//                a[i][i1] = count++;
//            }


//        a[5][3] = 1;

//        [1 0 0 0 0]
//        [1 1 0 0 0]
//        [1 1 1 0 0]
//        [1 1 1 1 0]
//        [1 1 1 1 1]

//        System.out.println(Arrays.deepToString(a));
    }
}


