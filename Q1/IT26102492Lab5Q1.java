import java.util.Scanner;

public class IT26102492Lab5Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOne;
        int numberTwo;
        int numberThree;
        int smallest;
        int largest;

        System.out.print("Enter the first integer: ");
        numberOne = input.nextInt();

        System.out.print("Enter the second integer: ");
        numberTwo = input.nextInt();

        System.out.print("Enter the third integer: ");
        numberThree = input.nextInt();

        // Start by treating the first number as both the smallest and largest.
        smallest = numberOne;
        largest = numberOne;

        if (numberTwo < smallest) {
            smallest = numberTwo;
        }
        if (numberTwo > largest) {
            largest = numberTwo;
        }

        if (numberThree < smallest) {
            smallest = numberThree;
        }
        if (numberThree > largest) {
            largest = numberThree;
        }

        System.out.println();
        System.out.println("User entered numbers are: "
                + numberOne + " " + numberTwo + " " + numberThree);
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);

        input.close();
    }
}