import java.util.Scanner;
public class Pizzaria{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo a pizzaria quasePronto >.<");

        Pedido pedido = new Pedido();
        
        String continuar;

        do{
            ItemDoPedido item = new ItemDoPedido();

            System.out.print("Informe o tipo de pizza '^' ");
            item.setTipo(input.nextLine().trim());

            System.out.print("Informe o sabor de pizza '^' ");
            item.setSabor(input.nextLine());

            pedido.addItem(item);
            
            pedido.setTotal(item.getValor());

            System.out.println(">.< mais alguma coisa pequeno padawan? >.<");
            continuar = input.nextLine();

        } while(!continuar.equalsIgnoreCase(""));

        System.out.print("Nome do cliente: ");
        pedido.setCliente(input.nextLine());

        System.out.print("local da entrega: ");
        pedido.setLocalEntrega(input.next());
        input.nextLine();

        pedido.setTotal(pedido.getTaxaDeEntrega());

        pedido.imprimir();
    }
}
