import java.util.Scanner;
public class  IT26102061Lab5Q1{
	public static void main(String[] args){
		
		int num1,num2,num3,largest_number,smallest_number;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		num1=input.nextInt();
		
		System.out.print("Enter the second integer: ");
		num2=input.nextInt();
		
		System.out.print("Enter the third integer: ");
		num3=input.nextInt();
		
		System.out.println("\nUser entered numbers are : "+num1 +" "+num2 +" " +num3);
		
		largest_number=num1;
		smallest_number=num1;
		
		if(num1<num2){
			largest_number=num2;
			
		}
		if(num2<num3){
			largest_number=num3;
			
		}
		
		if(num1>num2){
			smallest_number=num2;
			
		}
		if(num2>num3){
			smallest_number=num3;
			
		}
		
		System.out.println("The Smallest number is :"+smallest_number);
		System.out.println("The Largest number is :"+largest_number);
	}
}

		
			