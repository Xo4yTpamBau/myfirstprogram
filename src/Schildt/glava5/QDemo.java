package Schildt.glava5;

class Queue {
    char q[];
    int putloc, getloc;

    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    void put(char ch) {
        if (putloc == q.length) {
            System.out.println("Заполнена");
            return;
        }
        q[putloc++] = ch;
    }

    char get() {
        if (getloc == putloc) {
            System.out.println("пуста");
            return (char) 0;
        }
        return q[getloc++];
    }
}

 class Qdemo {
    public static void main (String args[]){
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("bigQ");

        for(i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        System.out.print("bigQ");
        for(i = 0; i < 26; i++){
            ch = bigQ.get();
            if(ch != (char)  0) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("smallQ");

        for (i = 0; i < 5; i++){
            System.out.print((char) ('z' - i));

            smallQ.put((char) ('z' - i));

            System.out.println();
        }

        System.out.println();

        for (i = 0; i < 5; i++) {
            ch = smallQ.get();

            if(ch != (char) 0) System.out.print(ch);
        }
    }

}