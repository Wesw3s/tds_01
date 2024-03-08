import java.util.Scanner;

class Inverter {

    public static void main(String[] args) {
        String v1, v2;

        Scanner scr = new Scanner( System.in );
        System.out.println("Tem uma frase com: ");
        v1 = scr.next();
         System.out.println("Tem uma frase com: ");
        v2 = scr.next();

        System.out.println (v2 + v1);
        scr.close();
    }
}
