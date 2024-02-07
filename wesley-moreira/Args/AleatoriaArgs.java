import java.util.Arrays;
import java.util.Random;

    class AleatoriaArgs {
        public static void main (String[] args) {
            Random rnm = new Random();
            String a = (Arrays.deepToString(args));  
            System.out.println(a.charAt(rnm.nextInt(a.length()-1)));
        }
    }