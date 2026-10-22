import java.util.Scanner;
public class IT26102597Lab5Q1{
 public static void main(String [] args){
  
  //Create an object called input to scanner class
  Scanner input = new Scanner (System.in);
  
  //Declare variables
  int number1, number2, number3, number4;
  
  System.out.println("Enter the first integer:");
  number1 = input.nextInt();
  
  System.out.println("Enter the second integer:");
  number2 = input.nextInt();
  
  System.out.println("Enter the third integer:");
  number3 = input.nextInt();
  
  //Assign smallest and largest to "number1"
  int smallest = number1;
  int largest = number1;
  
  //Compare "number2" with smallest and largest
  if (number2 > largest){
	 largest = number2;
  }
  
  if (number2 < smallest){
	  smallest = number2;
  }

  //Compare "number3" with smallest and largest
  if (number3 > largest){
	  largest = number3;
  }
  
  if (number3 < smallest){
	  smallest = number3;
  }
  
  
  //Print the integers
  System.out.println("user entered numbers are : " + number1 + " " + number2 + " " + number3 );
  
  //print the smallest integer
  System.out.println("The smallest number is : " + smallest);
  
  //print the largest integer
  System.out.println("The largest number is : " + largest);
  
   
  
}
}


