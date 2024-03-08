class Calculadora1 {
    public static void main (String[] args) {
        double resultado = 0; 
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[2]);
        String operador = args[1];

        //criando a instância da classe Calcular
        Calcular calc = new Calcular(a, b);

        if (operador.equals("+")) {
            resultado = calc.somar ();
            
        }
        if (operador.equals("-")) {
            resultado = calc.sub ();
            
        }
        if (operador.equals("x")) {
            resultado = calc.mult ();
            
        }
        if (operador.equals("/")) {
            resultado = calc.div ();
   
         }
         System.out.println(resultado);
    }
   
}
 
class Calcular {
    double numero1; //atributo
    double numero2; //atributo

    //metodo construtor da classe

    Calcular(double numero1, double numero2){
    this.numero1 = numero1;
    this.numero2 = numero2;
    }
    //métodos ^    

    public double somar() {
        return this.numero1 + this.numero2; 
    
    }
    public double sub() {
        return this.numero1 - this.numero2;
    
    }

    public double mult() {
        return this.numero1 * this.numero2;
    
    }
    public double div() {
        return this.numero1 / this.numero2;
    
    }
}
