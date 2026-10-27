import java.util.Scanner;

public class IT26102686Lab5Q1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int firstInteger;
		int secondInteger;
		int thirdInteger;
		int smallest;
		int largest;
		
		System.out.print("Enter the First ineger: ");
		firstInteger = input.nextInt();
		
		System.out.print("Enter the Second integer: ");
		secondInteger = input.nextInt();
		
		System.out.print("Enter the Third integer: ");
		thirdInteger = input.nextInt();
		
		System.out.println();
		System.out.println("User entered numbers are : "+firstInteger +" "+ secondInteger +" "+ thirdInteger);
		
		smallest = firstInteger;
		largest = firstInteger;
		
		if(secondInteger < smallest)
		{
			smallest = secondInteger;
		}
		
		if(thirdInteger < smallest)
		{
			smallest = thirdInteger;
		}
		
		if(secondInteger  > largest)
		{
			largest = secondInteger;
		}
		
		if(thirdInteger < largest)
		{
			largest = secondInteger;
		}
		
		System.out.println("The smallest number is: " + smallest);
		System.out.print("The largest number is: " + largest);
	
	}
}