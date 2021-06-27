package Schildt.glava2;

public class SCops {
    public static void main (String args[]){
        int n, d, q;

        n = 10;
        d = 2;
        if (d != 0 && (n % d) == 0) // Укороченная операция предотвращает деление на нуль
            System.out.println(d + " является делителем " + n);

        if (d != 0 & (n % d) == 0) // Теперь вычисляются оба выражения,
                                   // в результате чего будет выполняться деление на нуль
            System.out.println(d + " является делителем " + n);

    }
}
