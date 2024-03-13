import java.util.List;
import java.util.ArrayList;
public class Pedido {
    private int id;
    private double taxaEntrega = 10;
    private List<ItemDoPedido> itensDoPedido = new ArrayList();
    private String cliente;

    public void adicionarItemDoPedido(ItemDoPedido item) {
        this.itensDoPedido.add(item);
    }
    public void setCliente(String nome) {
        this.cliente = nome;
    }
    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }
    public double getTotal() {
        double total = 0;
        for (int = 0; i < this.)
    }
    public void imprimir() {
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Tx. Etrega: " + this.taxaEntrega);
        System.out.println("")
    }
}
