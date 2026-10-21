import java.util.Scanner;
public class IT26102049Lab5Q2 {
	public static void main (String[]args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print ("Enter the number of new members introduced :");
	double members = input.nextDouble();
	
	if (members == 0) {
	System.out.print("No Prize");
	}
	
	if (members == 1) {
	System.out.print("Prize is a : pen");
	}
	
	if (members == 2) {
	System.out.print("Prize is a : Umberella");
	}
	
	if (members == 3) {
	System.out.print("Prize is a : Bag");
	}
	
	if (members == 4) {
	System.out.print("Prize is a : Travelling Chair");
	}
	
	if (members >= 5) {
	System.out.print("Prize is a : Headphone");
	}
	
	}
}