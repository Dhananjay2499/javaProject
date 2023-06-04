
import java.util.Scanner;

public class oddEven {
    public static void main(String[] g){
        System.out.print("Give a number-> ");
        int input = new Scanner(System.in).nextInt();

        System.out.println("Even numbers up to "+input+" are : ");
        System.out.println(cal(input,false));
        System.out.println("Odd numbers up to "+input+" are : ");
        System.out.println(cal(input, true));

    }
    public static String cal(int in, boolean flag){
        StringBuilder string = new StringBuilder();
        for (int i = 0; i <=in; i++) {
            if (i%2 == 0 && !flag){
                string.append(" ").append(i);
            } else if (i%2 != 0 && flag) {
                string.append(" ").append(i);
            }
        }
        return String.valueOf(string);
    }
}
