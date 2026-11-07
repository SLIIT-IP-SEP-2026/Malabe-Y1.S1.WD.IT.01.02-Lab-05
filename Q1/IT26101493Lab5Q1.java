import java.util.Scanner;

public class  IT26101493Lab5Q1{
	public static  void main (String[]args){
		Scanner input = new Scanner(System.in);
		
		int n1,n2,n3,smallest,largest;
		
		System.out.print("Enter the first integer: ");
		n1 = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		n2 = input.nextInt();
		
		System.out.print("Enter the third integer: ");
		n3 = input.nextInt();
		
		System.out.println();
		System.out.println("User entered numbers are: " + n1 + " " + n2 + " " + n3);
		
		largest = n1;
		smallest = n1;
		
		if (largest < n2) {
			largest = n2;		
		}
		if (smallest > n2) {
			smallest = n2;
		}
		if (largest < n3) {
			largest = n3;
		}
		if (smallest > n3) {
			smallest = n3;
		}
		
		System.out.println("The smallest numer is: "+smallest);
		System.out.println("The largest numer is: "+largest);
		
		
	}
}