import java.util.Scanner;
public class IT26102557Lab5Q1{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the first integer");
	int number1 = input.nextInt();
	System.out.println("Enter the second integer");
	int number2 = input.nextInt();
	System.out.println("Enter the third integer");
	int number3 = input.nextInt();
	
	int highest,smallest;
	
	highest=number1;
	smallest=number1;
	if(number2<smallest){
		smallest = number2;
	}
	if(number3<smallest){
		smallest = number3;
	
	}
	if(number2>highest){
		highest = number2;
	}
	if(number3>highest){
		highest = number3;
	}
	
	System.out.println("User enterered numbers are "+number1+" "+number2+" "+number3);
	System.out.println("The Smallest number is "+smallest);
	System.out.println("The Highest number is "+highest);
	}
}