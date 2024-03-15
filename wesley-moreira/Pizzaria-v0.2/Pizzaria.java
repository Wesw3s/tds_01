import java.util.Scanner;
 
public class Pizzaria { 
    public static void main (String[] args) {
        System.out.println("Bem vindo a pizzaria quasePronto");

        Scanner sc = new Scanner(System.in);

        Pedido pedido = new Pedido();

        String continuar;
        do {
            ItemDoPedido item = new ItemDoPedido();

            System.out.println("Informe o tipo da pizza: ");
            item.setTipo(sc.next());

            System.out.println("Informe o sabor da pizza: ");
            item.setSabor(sc.next());

            System.out.println("Informe o valor da pizza: ");
            item.setValor(sc.nextDouble());

            pedido.adicionarItemDoPedido(item);

            System.out.println("> mais alguma coisa pequeno padawan? <");
            continuar = sc.next();

        } while(!continuar.equalsIgnoreCase(""));

        System.out.println("Nome do cliente: ");
        pedido.setCliente(sc.next());

        System.out.println("Taxa de entrega: ");
        pedido.setTaxaEntrega(sc.nextDouble());

        
        pedido.imprimir();
    }
}