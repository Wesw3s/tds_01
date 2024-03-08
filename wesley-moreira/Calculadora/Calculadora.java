//calculadora usando o static com orientação objeto
class Calculadora  {
    public static void main (String[] args) {
         double a = Double.parseDouble(args[0]);
         double b = Double.parseDouble(args[2]);

         if (args[1].equals ("+")) {
            double res = somar(a,b);
            System.out.println(res);
         }
         if (args[1].equals ("-")) {
            double res = sub(a,b);
            System.out.println(res);
         }
         if (args[1].equals ("x")) {
            double res = mult(a,b);
            System.out.println(res);
         }
         if (args[1].equals ("/")) {
            double res = div(a,b);
            System.out.println(res);
         }
    }
    
    public static double somar (double a, double b) {
        return a+b; 
    
    }
    public static double sub (double a, double b) {
        return a-b; 
    
    }
    public static double mult (double a, double b) {
        return a*b; 
    
    }
    public static double div (double a, double b) {
        return a/b; 
    
    }
}
