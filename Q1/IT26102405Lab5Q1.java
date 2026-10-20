import java.util.Scanner;
public class IT26102405Lab5Q1 {

	public static void main(String[] main) {
	
		Scanner input = new Scanner(System.in);
		int firstNum, secondNum, thirdNum, largest, smallest;
		
		System.out.print("Enter the first integer: ");
		firstNum = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		secondNum = input.nextInt();
		
		System.out.print("Enter the third integer: ");
		thirdNum = input.nextInt();
		
		System.out.println();
		
		largest = firstNum;
		smallest = firstNum;
		
		if (secondNum > largest) {
			largest = secondNum;
		}
		else if (secondNum < smallest) {
			smallest = secondNum;
		}
		
		if (thirdNum > largest) {
			largest = thirdNum;
		}
		else if (thirdNum < smallest) {
			smallest = thirdNum;
		}
		
		System.out.println("User entered numbers are : " + firstNum + " " + secondNum + " " + thirdNum);
		System.out.println("The Samallest number is: " + smallest);
		System.out.println("The Largest number is: " + largest);
		
		
	}

}