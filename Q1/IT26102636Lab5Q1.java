import java.util.Scanner;

  public class IT26102636Lab5Q1{
	  
	 public static void main (String[] args){
	  
	int numberOne , numberTwo , numberThree , smallest , largest;
		
     Scanner input =new Scanner(System.in);

    System.out.print("Enter the first integer: ");
    numberOne = input.nextInt();

    System.out.print("Enter the second integer: ");	
	numberTwo = input.nextInt();
	
	System.out.print("Enter the third integer: ");
	numberThree = input.nextInt();
	
	//Assign smallest and largest to 'numberOne' initially
	smallest = numberOne;
	largest = numberTwo;
	
	//compare 'numberTwo' with smallest and largest
	if(numberTwo<smallest){
		smallest = numberTwo;
	}
	if(numberTwo > largest){
		largest = numberTwo;
	}
	
	//compare 'numberThree' with smallest and largest
	if(numberThree < smallest){
		smallest = numberThree;
	}
	if (numberThree > largest){
	   largest = numberThree;
	}
	
     //Display the results
	   System.out.println();
	   System.out.println("User enter number are : " + numberOne + " " + numberTwo +" " +numberThree );
	System.out.println("The smallest number is: " + smallest);
	System.out.println("The largest number is:  " + largest);
	
	  }
  }