package Schildt.glava3;

public class Guess2 {
    public static void main(String args[])
            throws java.io.IOException {
        char ch, answer = 'K';

        System.out.println("Задумана буква из диапазона A-Z.");
        System.out.print("Попытайтесь её угадать: ");

        ch = (char) System.in.read();

        if (ch == answer) System.out.println("** Правильно! **");
        else System.out.println("...Извините, вы не угадали.");
    }
}


