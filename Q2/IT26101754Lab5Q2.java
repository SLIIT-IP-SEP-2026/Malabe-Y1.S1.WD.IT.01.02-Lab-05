import java.util.Scanner;

    public class IT26101754Lab5Q2 {
	
	    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of new members introduced : ");
		int numofmembers = sc.nextInt();
		
		if (numofmembers < 0) {
		   System.out.println("Input must be a number 0 or greater");
		   return;
		}

        switch(numofmembers) {
             case 0:
            System.out.println(" No prize");
            break;			
			
			 case 1:
            System.out.println("prize is a : Pen");
            break;			
			
			 case 2:
            System.out.println("prize is a : Umbrella");
            break;			
			
			 case 3:
            System.out.println("prize is a : Bag");
            break;			
			
			 case 4:
            System.out.println("prize is a : Travelling chair");
            break; 	

            default:
            System.out.println("Prize is a : Headphone");

		}
		
	}
	
}	

			