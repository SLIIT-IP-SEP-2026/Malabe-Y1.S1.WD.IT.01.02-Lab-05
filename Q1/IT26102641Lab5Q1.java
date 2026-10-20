import java.util.Scanner;

public class IT26102641Lab5Q1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter the second integer: ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter the third integer: ");
		int num3 = sc.nextInt();
		
		
		int smallest = num1;
		int largest = num1;
		
		//Find smallest
		if(num2 < smallest) {
			smallest = num2;
		}
		if(num3 < smallest) {
			smallest = num3;
		}
		
		//Find largest
		if(num2 > largest) {
			largest = num2;
		}
		if(num3 > largest) {
			largest = num3;
		}
		
		System.out.println("\nUser entered numbers are : " + num1 + " " + num2 + " " + num3);
		System.out.println("The Smallest number is: " + smallest);
		System.out.println("The largest number is: " + largest);
		
		sc.close();
	}
}