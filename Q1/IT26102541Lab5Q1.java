import java.util.Scanner; 

public class IT26102541Lab5Q1{
	
	public static void main(String[] args){
		
		int numberOne , numberTwo , numberThree , largest , smallest;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first integer:");
		numberOne=input.nextInt();
		
		System.out.print("Enter the second integer:");
		numberTwo=input.nextInt();
		
		System.out.print("Enter the third integer:");
		numberThree=input.nextInt();
		
		smallest = numberOne;
		largest = numberOne;
		
		if (numberTwo < smallest){
			smallest = numberTwo;
		}
		
		if (numberTwo > largest){
			largest = numberTwo;
		}
		
		if (numberThree < smallest){
			smallest = numberThree;
		}
		
		if (numberThree > largest){
			largest = numberThree;
		}
		
		System.out.println();
		System.out.println("User entered numders are : "  + numberOne + " " + numberTwo + " " + numberThree);
		System.out.println("The smallest number is : "  + smallest);
		System.out.println("The largest number is : "  + largest);
		
	}
}