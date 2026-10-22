import java.util.Scanner;

public class IT26101608Lab5Q1 {
    public static void main(String[] args) {
		
	int firstinteger,secondinteger,thirdinteger,smallestnumber,largestnumber;
	
	Scanner input = new Scanner(System.in);
	
	
    System.out.print("Enter the first integer: ");
	firstinteger = input.nextInt();
	
	System.out.print("Enter the second integer: ");
	secondinteger = input.nextInt();
	
	System.out.print("Enter the third integer: ");
	thirdinteger = input.nextInt();
	
	smallestnumber = firstinteger;
	largestnumber = firstinteger;
	
	
	if (secondinteger < smallestnumber){
		smallestnumber = secondinteger;
	}
	
	if (secondinteger > largestnumber){
		largestnumber = secondinteger;
	}
	
	
    if (thirdinteger < smallestnumber){
		smallestnumber = thirdinteger;
	}
	
	if (thirdinteger > largestnumber){
		largestnumber = thirdinteger;
	}
	
	
	System.out.println();
	System.out.println("User entered numbers are: " + firstinteger +" " + secondinteger +" " + thirdinteger);
	
	System.out.println("The Smallest number is: " + smallestnumber);
	System.out.println("The largest number is: " + largestnumber);
	
	}
	
}	
	
	
	
	