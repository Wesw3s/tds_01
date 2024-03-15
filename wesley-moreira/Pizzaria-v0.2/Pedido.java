import java.util.List;
import java.util.ArrayList;
public class Pedido {
    private ItemDoPedido itemDoPedido;
    private String cliente;
    private double taxaEntrega;
    private double total;

    public void adicionarItemDoPedido(ItemDoPedido item) {
        this.itemDoPedido = item;
    }
    public void setCliente(String nome) {
        this.cliente = nome;
    }
    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }
    public double getTotal() {
        return this.taxaEntrega + this.itemDoPedido.getValor();
    }

    public void imprimir() {

        System.out.println("-----------------------------------------------------------");
        System.out.println("<                    Pizzaria QuasePronto                 >");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Cliente   : " + this.cliente);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Sabor     : " + this.itemDoPedido.getSabor());
        System.out.println("-----------------------------------------------------------");
        System.out.println("Pizza     : " + this.itemDoPedido.getTipo());
        System.out.println("-----------------------------------------------------------");
        System.out.println("Tx. Etrega: " + this.taxaEntrega);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Valor     : " + this.itemDoPedido.getValor());
        System.out.println("-----------------------------------------------------------");
        System.out.println("Total     : " + this.getTotal());
        System.out.println("-----------------------------------------------------------");

    }
}
