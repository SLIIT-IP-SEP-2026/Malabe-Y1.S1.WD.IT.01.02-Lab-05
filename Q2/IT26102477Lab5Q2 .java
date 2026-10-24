import java.util.Scanner;
public class IT26102477Lab5Q2{
    public static void main (String [] args){
     
	 
	 int members;
	 Scanner input = new Scanner(System.in);
	 
	 System.out.print("Enter the number of new members introduced: ");
	 members = input.nextInt();

    if(members < 0){
		System.out.println("Input must be a number 0 or greater");
	}	 
	else {
		String prize;
		
		switch(members){
			case 0:
			prize = "No prize";
			break;
			case 1:
			prize = "Pen";
			break;
			case 2:
			prize = "Umbrella";
			break;
			case 3:
			prize = "bag";
			break;
			case 4:
			prize = "Travelling Chair";
			break;
			default:  >=5;
			prize = "Headphone";
			break;	
		}
		if(members == 0){
			System.out.println("Sorry: " + prize);
		}
		else {
			System.out.println("Your prize is:" + prize);
		}
	}
	 
	 
	 
	 
	 
	 }
	 }
	 