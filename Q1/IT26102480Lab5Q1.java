import java.util.Scanner;
public class IT26102480Lab5Q1{
	public static void main(String[]args){
	
	Scanner value = new Scanner(System.in);
	
	System.out.print("Enter the first integer: ");
	int numberOne = value.nextInt();
	
	System.out.print("Enter the second integer: ");
	int numberTwo = value.nextInt();
	
	System.out.print("Enter the third integer: ");
	int numberThree = value.nextInt();
	
	int smallest = numberOne;
	int largest = numberOne;
	
	if (smallest > numberTwo){
		smallest = numberTwo;
	}
	if (largest < numberTwo){
		largest = numberTwo;
	}	
	if (smallest > numberThree){
		smallest = numberThree;
	}
	if (largest < numberThree){
		largest = numberThree;
	}
	
	System.out.println("\nuser entered numbers are: "+numberOne + " " +numberTwo + " "+numberThree);
	System.out.println("smallest number is: " +smallest);
	System.out.println("largest number is: " +largest);
}

}	