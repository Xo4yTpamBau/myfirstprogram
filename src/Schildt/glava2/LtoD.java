package Schildt.glava2;

public class LtoD {
    public static void main(String args[]){
        long L;
        double D;

        L = 100112385L;
        D = L; // Автоматическое преобразование типа long в double
        // D = 100112385.0;
        // L = D;              //Наоборот нельзя

        System.out.println("L и D: " + L + " " + D);
    }
}

