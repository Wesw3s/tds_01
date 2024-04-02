import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
public class Compras{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Usuario usuario = new Usuario();
        Pedido pedido = new Pedido();

        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formatData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        pedido.setData(data.format(formatData));


        System.out.print("Nome: ");
        usuario.setNome(sc.nextLine());

        System.out.print("Email: ");
        usuario.setEmail(sc.nextLine());

        System.out.print("Senha: ");
        usuario.setSenha(sc.nextLine());
        System.out.println();

        pedido.setCliente(usuario);

        String continuar;
        do{
            Produto produto = new Produto();
            System.out.print("Produto: ");
            produto.setNomeP(sc.nextLine());

            while (true){
                try {
                    System.out.print("Preço: ");
                    produto.setPreco(sc.nextDouble());
                    sc.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.err.println("INFORME UM VALOR NÚMERICO");
                    sc.nextLine();
                } 
            }

            System.out.print("Descricao: ");
            produto.setDescricao(sc.nextLine());

            pedido.setTotal(produto.getPreco());

            pedido.addProduto(produto);

            System.out.print("> continuar a comprar? ");
            continuar = sc.nextLine();
            System.out.println();

        } while(!continuar.equalsIgnoreCase(""));

        System.out.print("Endereço: ");
        pedido.setEndereco(sc.nextLine());

        while (true){
            try {
                System.out.print("Frete: ");
                pedido.setFrete(sc.nextDouble());
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.err.println("INFORME UM VALOR NÚMERICO");
                sc.nextLine();
            } 
        }

        pedido.setTotal(pedido.getFrete());
        
        System.out.print("Pagamento: ");
        pedido.setPagamento(sc.nextLine());

        pedido.imprimir();
        sc.close();
    }
}
