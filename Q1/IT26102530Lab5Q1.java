import java.util.Scanner;

public class IT26102530Lab5Q1 { 
    public static void main(String[] args) {
        
        // Declare the variables
        int numberOne, numberTwo, numberThree, smallest, largest;
        
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter three integers
        System.out.print("Enter the first integer: ");
        numberOne = input.nextInt();
        
        System.out.print("Enter the second integer: ");
        numberTwo = input.nextInt();
        
        System.out.print("Enter the third integer: ");
        numberThree = input.nextInt();
        
        // Assign smallest and largest to 'numberOne' initially
        smallest = numberOne;
        largest = numberOne;
        
        // Compare 'numberTwo' with smallest and largest
        if (numberTwo < smallest) {
            smallest = numberTwo;
        }
        if (numberTwo > largest) {
            largest = numberTwo;
        }
        
        // Compare 'numberThree' with smallest and largest
        if (numberThree < smallest) {
            smallest = numberThree;
        }
        if (numberThree > largest) {
            largest = numberThree;
        }
        
        // Display the results
        System.out.println();
        System.out.println("User entered numbers are : " + numberOne + " " + numberTwo + " " + numberThree);
        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);
        
    }
}