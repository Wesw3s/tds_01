import java.util.Arrays;

    class ConcatenarArgs {
        public static void main (String[] args) {
            System.out.println (Arrays.deepToString(args));
            String a = args[0];
            String b = args[1];
            System.out.println(a + " " + b);
        }
    }