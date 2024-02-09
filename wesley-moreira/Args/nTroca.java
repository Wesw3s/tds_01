class nTroca {
        
        public static void main (String args[]) {
                int n = args.length;
                for (int i = 0; i < args.length; i++) {
                        System.out.print(args[i]);
                if (i < n-1){
                        System.out.print ("-");
                }
                } 
                System.out.println();
        }
}
