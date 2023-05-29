import java.util.Scanner;

public class Factorial {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a number to calculate factorial: ");
        long input = sc.nextInt();

        if (input < 0) {
            System.out.print("Invalid number for a factorial");
        } else {
            System.out.print("Factorial of " + input + " is " + fib(input));
        }
    }

    public static long fib(long num) {
        long store = 1;
        for (int i = 1; i <= num; i++) {
            store = store * i;
        }
        return store;
    }
}
