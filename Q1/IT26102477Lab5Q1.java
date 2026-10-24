import java.util.Scanner;
    public class IT26102477Lab5Q1{
	   public static void main(String [] args){
	   
    int number1, number2, number3, largeNumber, smallNumber; 
	Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");	
	number1 = input.nextInt();   
	   
	System.out.print("Enter a number: ");	
	number2 = input.nextInt(); 
	
	System.out.print("Enter a number: ");	
	number3 = input.nextInt(); 
	
	if (number1 > number2 && number1 > number3){
		largeNumber = number1;
		System.out.println("Number 1 is the largest:" + number1);	
		
	}
	if (number2 > number1 && number2 > number3) {
		largeNumber = number2;
		System.out.println("Number 2 is the largest: "+ " " + number2);	
		
	}
	if (number3 > number1 && number3 > number2) {
		largeNumber = number3;
		System.out.println("Number 3 is the largest:" + " " + number3);	
		
	}
	if (number1 < number2 && number1 < number3){
		smallNumber = number1;
		System.out.println("Number 1 is the smallest:" + " " + number1);	
	}
	if (number2 < number1 && number2 < number3) {
		smallNumber = number2;
		System.out.println("Number 2 is the smallest:" + " " + number2);	
	}
	if (number3 < number1 && number3 < number2) {
		smallNumber = number3;
		System.out.println("Number 3 is the smallest:" + " " + number3);	
	}
	   
	 System.out.println("The numbers you entered:" + number1 + " " + number2 + " " + number3);  
}
}	   

