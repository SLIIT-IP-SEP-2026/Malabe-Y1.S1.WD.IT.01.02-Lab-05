import java.util.Scanner;
public class IT26102737Lab5Q1
{
	public static void main(String[] args)
	{
		int num1,num2,num3,smallest,largest;
		
		Scanner hello = new Scanner(System.in);
		
		System.out.println("Enter the first integer :");
		num1 = hello.nextInt();
		
		System.out.println("Enter the second integer :");
		num2 = hello.nextInt();
		
		System.out.println("Enter the third integer :");
		num3 = hello.nextInt();
		
		smallest = num1;
		largest = num1;
		
		if(num2 > largest){
			largest = num2;
		}
		
		if(num2 < smallest){
			smallest = num2;
		}
		
		if(num3 > largest){
			largest = num3;
		}
		
		if(num3 < smallest){
			 smallest = num3;
		}
		
		System.out.println("User enterd numbers are :" + num1 + " " + num2 + " " + num3);
		
		System.out.println("The Smallest number is :" + smallest);
		
		System.out.println("The Largest number is :" + largest);
	}
}	