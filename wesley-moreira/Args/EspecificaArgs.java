class EspecificaArgs {
        public static void main (String[] args) {
           Integer pos = Integer.parseInt(args[0]);
           String w = args[1];
           System.out.println(w.charAt(pos -1));
        }
    }
