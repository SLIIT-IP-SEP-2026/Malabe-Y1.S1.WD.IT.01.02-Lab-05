import java.util.Scanner;
public class IT26102460Lab5Q1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 1st integer: ");
		int integer_1 = input.nextInt();
		
		System.out.print("Enter 2nd integer: ");
		int integer_2 = input.nextInt();
		
		System.out.print("Enter 3rd integer: ");
		int integer_3 = input.nextInt();
		
		System.out.println(" ");
		
		if (integer_1 > integer_2 && integer_1 > integer_3){
			int largest_integer = integer_1;
			System.out.println("The largest integer: " + largest_integer);
		}
		else if (integer_2 > integer_1 && integer_2 > integer_3){
			int largest_integer = integer_2;
			System.out.println("The largest integer: " + largest_integer);
		}
		else{
			int largest_integer = integer_3;
			System.out.println("The largest integer: " + largest_integer);
		}
		
		
		
		if (integer_1 < integer_2 && integer_1 < integer_3){
			int smallest_integer = integer_1;
			System.out.println("The smallest integer: " + smallest_integer);
		}
		else if (integer_2 < integer_1 && integer_2 < integer_3){
			int smallest_integer = integer_2;
			System.out.println("The smallest integer: " + smallest_integer);
		}
		else{
			int smallest_integer = integer_3;
			System.out.println("The smallest integer: " + smallest_integer);
		}
	}
}