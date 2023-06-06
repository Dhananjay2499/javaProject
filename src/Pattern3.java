public class Pattern3 {
    public static void main(String[] a){
        for (int i = 10; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
