package Schildt.glava2;

public class CastDemo {
    public static void main(String args[]){
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x/y); //теряется дробная часть
        System.out.println("Целочисленный результат деления x / y: " + i);

        i = 100;
        b = (byte) i; // Информация не теряется
        System.out.println("Значение b: " + b);

        i = 257; // Информация теряется
        b = (byte) i;
        System.out.println("Значение b: " + b);

        b = 88;
        ch = (char) b; //приведение несовместных типов
        System.out.println("ch: " + ch);

    }
}
