
import java.util.Scanner;

    public class IT26102533Lab5Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = input.nextInt();

        int smallestnum = num1;
        int largestnum = num1;

        if (num2 > largestnum) {
            largestnum = num2;
        }

        if (num3 > largestnum) {
            largestnum = num3;
        }

        if (num2 < smallestnum) {
            smallestnum = num2;
        }

        if (num3 < smallestnum) {
            smallestnum = num3;
        }

        System.out.println("User entered numbers are: "
                + num1 + " " + num2 + " " + num3);

        System.out.println("The smallest number is: " + smallestnum);
        System.out.println("The largest number is: " + largestnum);

       
    }
}
