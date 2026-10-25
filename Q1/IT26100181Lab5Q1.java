import java.util.Scanner;
public class IT26100181Lab5Q1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the 1st integer number : ");
		int num1 = input.nextInt();
		
		System.out.print("Enter the 2nd integer number : ");
		int num2 = input.nextInt();
		
		System.out.print("Enter the 3rd integer number : ");
		int num3 = input.nextInt();
		
		// Finding the largest number...
		int max = num1;
		if (num2 > max){
			max = num2;	
		}
		if(num3 > max){
			max = num3;
		}		
		
		// Finding the smallest number...
		int min = num1;
		if (num2 < min){
			min = num1;	
		}
		if(num3 < min){
			min = num3;
		}
		
		// Displaying the largest and smallest number...
		System.out.println();
		
		System.out.println("User entered numbers are : " + num1 + "," + num2 + "," + num3 );
		System.out.println("The largest number is : " + max);
		System.out.println("The smallest number is : " + min);
	}
}