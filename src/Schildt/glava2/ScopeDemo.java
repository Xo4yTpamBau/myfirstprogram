package Schildt.glava2;

public class ScopeDemo {
    public static void main(String args[]){
        int x;

        x = 10;
        if(x == 10){

            int y = 20;

            System.out.println("x и y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; //Ошибка!

        System.out.println("x - это " + x);
    }
}
