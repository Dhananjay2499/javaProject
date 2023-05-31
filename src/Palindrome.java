import java.util.Scanner;

public class Palindrome {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number greater than 9 = ");
        int input = sc.nextInt();

        if (input >= 9) {
            if (pal(input)) {
                System.out.print(input + " number is a Palindrome!\n" + input + " | " + input);
            } else {
                System.out.print(input + " number is not Palindrome!");
            }
        } else {
            System.out.print("Number is not greater than 9");
        }
    }

    public static boolean pal(int get) {
        int st = get;
        int output = 0;
        while (st > 0) {
            int temp = st % 10;
            output = (output * 10) + temp;
            st = st / 10;
        }
        return (output==get);
    }
}
