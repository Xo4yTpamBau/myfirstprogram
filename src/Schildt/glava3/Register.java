package Schildt.glava3;

public class Register {
    public static void main(String[] args)
        throws java.io.IOException {
        char letter;
        int count = 0;

        System.out.print("Введите букву у которой хотели бы изменить регистр\n" +
                "Для завершения программы введите: ");

        do {

            letter = (char) System.in.read();

            if (letter >= 65 & letter <= 90){
                count++;
                System.out.println((char) (letter + 32));
            }
            else if (letter >= 97 & letter <= 122){
                count++;
                System.out.println((char)(letter - 32));
            }

        }while(letter != '.');

        System.out.println("Программа завершна;\n" +
                "Количество букв, у которых был изменён регистр: " + count);

    }
}
