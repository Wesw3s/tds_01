public class ItemDoPedido{
    private double valor;
    private String sabor;
    private String tipo;

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setSabor(String sabor){
        this.sabor = sabor;
    }

    //public void setValor(Double valor){
    //    this.valor = valor;
    //}

    public double getValor(){
        if (this.tipo.equalsIgnoreCase("tradicional")) {
            return 40;
        }else{
            return 50;
        }
    }

    public String getSabor(){
        return this.sabor;
    }

    public String getTipo(){
        return this.tipo;
    }

}
