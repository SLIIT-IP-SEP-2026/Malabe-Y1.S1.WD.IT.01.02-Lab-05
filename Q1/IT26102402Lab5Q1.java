import java.util.Scanner;
public class IT26102402Lab5Q1{
	public static void main(String[]args){
		int number1,number2,number3,smallest,largest;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first integer:");
		number1 = input.nextInt();
		
		System.out.print("Enter the second integer:");
		number2 = input.nextInt();
		
		System.out.print("Enter the third integer:");
		number3 = input.nextInt();
		
		//Assign largest & smallest
		largest = number1;
		smallest = number1;
		
		//comparing number2
		if(number2<smallest){
			smallest = number2;
		}
		if(number2>largest){
			largest = number2;
		}
		
		//comparing number3
		if(number3<smallest){
			smallest = number3;
		}
		
		if(number3>largest){
			largest = number3;
		}
		
		//Display the results
		System.out.println();
		System.out.println("User entered numbers are: "+number1+" "+number2+" "+number3);
		System.out.println("The smallest number is: "+smallest);
		System.out.println("The largest number is: "+largest);
		
	}
}