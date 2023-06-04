
import java.util.Scanner;

public class oddEven {
    public static void main(String[] g){
        System.out.print("Give a number-> ");
        int input = new Scanner(System.in).nextInt();

        System.out.println("Even numbers up to "+input+" are : ");
        cal(input,false);
        System.out.println("Odd numbers up to "+input+" are : ");
        cal(input, true);

    }
    public static void cal(int in, boolean flag){
        for (int i = 0; i <=in; i++) {
            if (i%2 == 0 && !flag){
             System.out.print(" "+ i );
            } else if (i%2 != 0 && flag) {
                System.out.print(" "+ i );
            }
        }
        System.out.println();
    }
}
