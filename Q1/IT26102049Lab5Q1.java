import java.util.Scanner;
public class IT26102049Lab5Q1 {
	public static void main (String[]args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the first integer ");
	int integer_one = input.nextInt();
	
	
	System.out.print("Enter the secound integer ");
	int integer_two = input.nextInt();
	
	
	System.out.print("Enter the third integer ");
	int integer_three = input.nextInt();
	
	System.out.print("user entered numbers are :" + " " + integer_one + " " + integer_two + " " + integer_three);
	
	int smallest = integer_one;
	int largest = integer_one;
	
	if (integer_two < smallest){
	System.out.print("the smallest number is :" + smallest);
	}
	
	if (integer_two < largest){
	System.out.print("the largest number is :" + largest);
	}
	
	if (integer_three < smallest){
	System.out.print("the smallest number is :" + smallest);
	}
	
	if (integer_three < largest){
	System.out.print("the largest number is :" + largest);
	}
	
	
	
	}
}