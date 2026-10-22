import java.util.Scanner;
public class IT26102457Lab5Q1
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		
		int number1;
		int number2;
		int number3;
		int largestnumber;
		int smallestnumber;
		
		System.out.print("Enter the first integer:");
		number1=input.nextInt();
		
		System.out.print("Enter the second integer:");
		number2=input.nextInt();
		
		System.out.print("Enter the thired integer:");
		number3=input.nextInt();
		
		System.out.println(" ");
		System.out.println("User entered numbers are :"+" "+number1+" "+number2+" "+number3);
		
		if (number1>number2 && number1>number3)
			largestnumber=number1;
		else if(number2>number1 && number2>number3)
			largestnumber=number2;
		else
			largestnumber=number3;
		
		if (number1<number2 && number1<number3)
			smallestnumber=number1;
		else if(number2<number1 && number2<number3)
			smallestnumber=number2;
		else
			smallestnumber=number3;
		
		
		System.out.println("The smallest number is : "+smallestnumber);
		System.out.println("The largest number is : "+largestnumber);
	}
}