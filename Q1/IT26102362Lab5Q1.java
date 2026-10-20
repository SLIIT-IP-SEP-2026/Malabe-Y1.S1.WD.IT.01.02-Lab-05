import java.util.Scanner;
public class  IT26102362Lab5Q1{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int num1,num2,num3, smallest, largest;
		
		System.out.print("Enter number 1: ");
		num1 = input.nextInt();
		
		System.out.print("Enter number 2: ");
		num2 = input.nextInt();
		
		System.out.print("Enter number 3: ");
		num3 = input.nextInt();
		
		smallest = num1;
		largest = num1;
		
		if (smallest>num2){
			smallest = num2;
		}
		if (largest<num2){
			largest = num2;
		}
		if (smallest>num3){
			smallest = num3;
		}
		if (largest<num3){
			largest = num3;
		}
		System.out.println("\nUser entered numbers are: "+num1+" "+num2+" "+num3);
		System.out.println("The Smallest number is: "+smallest);
		System.out.println("The largest number is: "+largest);
	}
}