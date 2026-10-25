import java.util.Scanner;

 public class IT26102000Lab5Q1{
 
 public static void main(String[] args){
 
  int numOne, numTwo, numThree, smallest, largest;
  
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter the first integer: ");
   numOne = input.nextInt();
   
   System.out.print("Enter the second integer: ");
   numTwo = input.nextInt();
   
   System.out.print("Enter the third integer: ");
   numThree = input.nextInt();
   
   System.out.println("\nUser entered numbers are : "+numOne+ " "+numTwo+ " "+numThree);
   
   smallest = numOne;
   largest = numOne;
   
   if(smallest > numTwo){
   
   smallest = numTwo ;
   
   }
   
   if(largest < numTwo){
   
   largest = numTwo;
   
   }
   
   if(smallest > numThree){
   
   smallest = numThree;
   
   }
   
   if(largest < numThree){
   
   largest = numThree;
   
   }
   
   System.out.println("\nThe smallest number is: "+smallest);
   System.out.println("The largest number is: "+largest); 
   
  }
 
 }