/*  In fibonacci series, next number is the sum of previous two numbers
    for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
    The first two numbers of fibonacci series are 0 and 1.
*/

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] arr){
        Scanner scan = new Scanner(System.in);
        System.out.print("Give arr number: ");
        int input = scan.nextInt();
        System.out.println(fib(input));
    }

    static String fib(int in){
        StringBuilder output = new StringBuilder();
        int prev = 0; int curr = 1;
        output.append(prev).append(" ");
        output.append(curr).append(" ");
        for (int i = 1; i <= in-2; i++) {
            int temp = prev + curr;
            output.append(temp).append(" ");
            prev = curr;
            curr = temp;
        }

        return String.valueOf(output);
    }
}
