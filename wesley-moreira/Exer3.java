class Exer3{
    public static void main (String args[]) {
        String frase = "";
        for (int i = args.length-1; i >- 1; i--){
            frase += args[i];
        if (i > 0){
            frase += " ";
        } 
        }  
        System.out.println(frase);
    }
}
