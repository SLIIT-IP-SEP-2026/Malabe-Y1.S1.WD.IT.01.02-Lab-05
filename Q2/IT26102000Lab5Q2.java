import java.util.Scanner;

public class IT26102000Lab5Q2{

public static void main(String[] args){

 int number;
 
 Scanner input = new Scanner(System.in);
 System.out.print("Enter the number of new members introduced: ");
 number = input.nextInt();
 
 if(number < 0){
	 System.out.print("Input must be number 0 or greater.\n");
	 return;
 }
 
 switch(number){
	 
  case 0 : System.out.print("No Prize");
             break;	 
 
  case 1 : System.out.print("Prize is: Pen");
             break;
			 
  case 2 : System.out.print("Prize is: Umbrella");			 
             break;
			 
  case 3 : System.out.print("Prize is: Bag");			 
             break;

  case 4 : System.out.print("Prize is: Travelling Chair");			 
             break;

  default : System.out.print("Prize is: Headphone");			 
             break;			 
 }
 
 System.out.println();

}

}