import java.util.Scanner;
public class IT26102736Lab5Q1 {
	public static void main(String[] args) {
		
		//create scanner object
		Scanner input = new Scanner(System.in); 
		
		//get fisrt integer
		System.out.print("Enter the first integer: ");
		int numberOne = input.nextInt();
		
		//get second integer
		System.out.print("Enter the Second integer: ");
		int numberTwo = input.nextInt();
		
		//get a third integer
		System.out.print("Enter the third integer: ");
		int numberThree = input.nextInt();
		
		//displaying the user entered numbers
		System.out.println("User entered numbers are : " + numberOne + " " +numberTwo + " " + numberThree + " " ); 
		
		
		//decalring largest number and smallest number 
		int largestNumber,smallestNumber;
		
		//and Comparing two numbers
		if (numberOne>numberThree) {
			largestNumber = numberOne;
			smallestNumber = numberTwo;
		}
		else{
			largestNumber = numberTwo;
			smallestNumber = numberOne;
		}	
		//comparing number three withlargest and smallest numbers
		if(largestNumber<numberThree){
			largestNumber = numberThree;
		}
		if (smallestNumber>numberThree) {
			smallestNumber = numberThree;
		}
		
		//Displaying the smallest and largest numbers
		System.out.println("\nThe Smallest number is: " +smallestNumber);
		System.out.println("The largest number is: " +largestNumber);
		
		//close scanner
		input.close();
	}
}