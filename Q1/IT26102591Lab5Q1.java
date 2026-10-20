import java.util.Scanner;

	public class IT26102591Lab5Q1{
		
		public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
			int num1 = input.nextInt();
		System.out.print("Enter first number: ");
			int num2 = input.nextInt();
		System.out.print("Enter first number: ");
			int num3 = input.nextInt();
			
		int smallest;
		int largest;
		
			if( num1 < num2 && num1 < num3 ){
				smallest = num1;
			}
			else if( num2 < num1 && num2 < num3) {
				smallest = num2;
			}
			else  {
				smallest = num3;
			}
			
			
			 if( num1 > num2 && num1 > num3 ){
				largest = num1;
			}
			else if( num2 > num1 && num2 > num3) {
				largest = num2;
			}
			else  {
				largest = num3;
			}
			System.out.println("Smallest number: " + smallest);
			System.out.println("Largest number: " + largest);
		
		
		
			
			
		
		}
	}

