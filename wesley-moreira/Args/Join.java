class Join {
    public static void main (String args[]) {
        int n = args.length;
        String grude = " ";
        for (int contador = 0; contador < n; contador++){
            System.out.print ( grude + args [contador]);
            grude = "-";
        }
        }
}
