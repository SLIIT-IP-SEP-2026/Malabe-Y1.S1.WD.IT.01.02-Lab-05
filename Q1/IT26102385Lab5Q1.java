import java.util.Scanner;
public class IT26102385Lab5Q1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first Integer");
		int num1=sc.nextInt();
		System.out.print("Enter the secound Integer");
		int num2=sc.nextInt();
		System.out.print("Enter the third Integer");
		int num3=sc.nextInt();
		System.out.println("number is"+num1+num2+num3);
		
		int smallest=num1;
		if(smallest>num2){
			smallest=num2;
		}
		if(smallest>num3){
			smallest=num3;
		}
		int largest=num1;
		if(largest<num2){
			largest=num2;
		}
		if(largest<num3){
			largest=num3;
		}
		System.out.println("smallest number is"+ smallest);
		System.out.println("largest number is"+ largest);
	}
}