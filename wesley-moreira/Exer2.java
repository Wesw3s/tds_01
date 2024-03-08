class Exer2 {
    public static void main (String args[]) {
        String palavras = "";
        for (int i = 0; i < args.length; i++){
                palavras += args[i];
        }
        System.out.println(palavras.length());
    }
}
