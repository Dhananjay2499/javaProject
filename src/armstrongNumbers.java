import java.util.Scanner;

public class armstrongNumbers {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a max range to check an Armstrong Number ");
        int input = sc.nextInt();

        System.out.println("Armstrong Numbers up to given number-> ");
        for (int i = 1; i <= input; i++) {
            int power = getPow(i); //Get power of a 10 number
            if (armSt(i, power)) {
                System.out.print(i + " ");
            }
        }
    }

    public static int getPow(int input) {
        int power = 0;
        while (input > 0) {
            input = input / 10;
            power++;
        }
        return power;
    }

    public static boolean armSt(int input, int power) {
        int output = 0;
        int compare = input;
        while (input > 0) {
            int temp = (int) Math.pow(input % 10, power);
            output = output + temp;
            input = input / 10;
        }
        return (compare==output);
    }
}
