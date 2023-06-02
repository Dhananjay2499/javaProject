import java.util.Scanner;

public class armstrongNumbers {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give a max range to check an Armstrong Number ");
        int input = sc.nextInt();

        System.out.print("Armstrong Numbers up to the given number-> ");

        for (int i = 1; i <= input; i++) {
            int power = String.valueOf(i).length(); //Get power of a number
            if (armSt(i, power)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean armSt(int input, int power) {
        int output = 0;
        int compare = input;
        while (input > 0) {
            int temp = (int) Math.pow(input % 10, power);
            output = output + temp;
            input /= 10;
        }
        return (compare==output);
    }
}
