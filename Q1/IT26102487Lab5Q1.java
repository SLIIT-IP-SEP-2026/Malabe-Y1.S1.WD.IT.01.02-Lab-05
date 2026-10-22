import java.util.Scanner;

  public class IT26102487Lab5Q1 {
   public static void main(String[]args){
      
	   Scanner input = new Scanner (System.in);	
	   
	   System.out.print("Enter the first number");
	   int numberOne = input.nextInt();
	   
	   System.out.print("Enter the second number");
	   int numberTwo = input.nextInt();
	   
       System.out.print("Enter the third number");
	   int numberThree = input.nextInt();
      	   
	   
	   double smallest = numberOne;
  if (numberTwo < smallest){
       smallest = numberTwo;
  }
   
  if (numberThree < smallest){
       smallest = numberThree;
  }
     
       double largest = numberOne;
  if (numberTwo > largest){
       largest = numberTwo;
  } 

  if (numberThree > largest){
      largest = numberThree;
  }	
	  
	  System.out.println("Smallest number is:" + smallest);
	  System.out.println("largest number is:" + largest);
  
   
  }
 }
