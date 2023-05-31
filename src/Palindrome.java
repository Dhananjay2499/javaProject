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
                System.out.print(input + " number is not a Palindrome!");
            }
        } else {
            System.out.print("Number is not greater than 9");
        }
    }

    public static boolean pal(int get) {
        int st = get; //store
        int output = 0;
        while (st > 0) {
            int temp = st % 10; //store last digit(e.g. 121-> temp=1)
            output = (output * 10) + temp; //(e.g.  output= (0*10)+1=1 -> (1*10)+2=12 )
            st = st / 10; // reduce by 1 digit
        }
        return (output==get);
    }
}
