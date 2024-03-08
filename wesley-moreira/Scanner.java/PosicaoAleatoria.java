import java.util.Scanner;
import java.util.Random;

class PosicaoAleatoria {
    public static void main(String[] args) {
        Random rnm = new Random();
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        System.out.println(a.charAt(rnm.nextInt(a.length()-1)));

    }
}
