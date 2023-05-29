import java.util.Scanner;

public class Factorial {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a number ");
        int input = sc.nextInt();
        System.out.print("Factorial of "+input+" is " + fib(input));
    }

    public static int fib( int num) {
        int store = 1;
        for(int i = 1; i <= num; i++){
            store = store * i;
        }
        return store;
    }
}
