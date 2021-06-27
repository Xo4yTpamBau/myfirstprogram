package Schildt.glava3;

public class Point {
    public static void main(String args[])
            throws java.io.IOException {
        int spaces = 0;
        char point, ignore;

        do{
            System.out.println("Для завершения программы ведите . :");
           point = (char) System.in.read();
           ignore = (char) System.in.read();
                    if ( point == ' ') spaces++;
        } while (point != '.');
        System.out.println("Количество пробелов:" +  spaces);
    }
}
