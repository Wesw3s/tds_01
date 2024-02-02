import java.util.Scanner;
class PosicaoEspecifica {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String as = scan.nextLine();
        System.out.println("Digite a posicao: ");
        int posicao = scan.nextInt();
        char letraPos = as.charAt(posicao);
        System.out.println(letraPos);
    }
}
