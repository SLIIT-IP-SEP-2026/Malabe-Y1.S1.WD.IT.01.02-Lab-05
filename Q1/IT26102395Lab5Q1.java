import java.util.Scanner;
public class IT26102395Lab5Q1{
	public static void main(String[] args){
		
		Scanner ok =new Scanner(System.in);
		
		System.out.print("Enter the first interger:");
		int num_1= ok.nextInt();
		
		System.out.print("Enter the Second interger:");
		int num_2= ok.nextInt();
		
		System.out.print("Enter the Third interger:");
		int num_3= ok.nextInt();
		
		
		System.out.println("User entered numbers are :"+num_1 + " "+num_2+" "+ num_3);
		
		int largest=num_1;
		int smallest=num_1;
		
		
		if(num_2<num_1){
			smallest=num_2;
		}
		if(num_3<smallest){
			smallest=num_3;
		}
		if(num_2>num_1){
			largest=num_2;
		}
		if(num_3>largest){
			largest=num_3;
		}
		
		
		System.out.println("The Smallest number is :"+smallest);
		System.out.println("The Smallest number is :"+largest);
	}
}