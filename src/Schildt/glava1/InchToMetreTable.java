package Schildt.glava1;

public class InchToMetreTable {
    public static void main(String args[]){
        double inch, metre;
        int counter;

        counter = 0;
        for(inch = 1; inch <=144; inch++){
            metre = inch / 39.37;
            System.out.println(inch + " дюймам соответствует " + metre + " метров.");

            counter++;
            if(counter == 12){
                System.out.println();
                counter = 0;
            }
        }

    }
}

