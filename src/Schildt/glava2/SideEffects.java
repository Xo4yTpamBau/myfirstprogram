package Schildt.glava2;

public class SideEffects {
    public static void main(String args[]){
        int i;

        i = 0;

        if(false & (++i < 100)) // Значение i инкременируется
            System.out.println("Эта строка не будет отображаться");
        System.out.println("Инструкция if выполняется: " + i);

        if(false && (++i < 100)) // Значение i не инкременируется
            System.out.println("Эта строка не будет отображаться");
        System.out.println("Инструкция if выполняется: " + i);

    }
}
