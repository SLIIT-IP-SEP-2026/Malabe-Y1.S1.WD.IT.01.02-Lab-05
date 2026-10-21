import java.util.Scanner;
public class IT26102706Lab5Q1{
public static void main(String[]args){
	
	Scanner scanner = new Scanner (System.in);
	System.out.print("Enter your first integer:");
	int firstinteger=scanner.nextInt();
	System.out.print("Enter your second integer:");
	int secondinteger=scanner.nextInt();
	System.out.print("Enter your third integer:");
	int thirdinteger=scanner.nextInt();
	
	System.out.println("User entered numbers are: " + firstinteger + ", " + secondinteger + ", " + thirdinteger);
	int smallest = firstinteger;
        if (secondinteger < smallest) {
            smallest = secondinteger;
        }
        if (thirdinteger < smallest) {
            smallest = thirdinteger;
        }

        
        int largest = firstinteger;
        if (secondinteger > largest) {
            largest = secondinteger;
        }
        if (thirdinteger > largest) {
            largest = thirdinteger;
        }

       
        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);
}
}
