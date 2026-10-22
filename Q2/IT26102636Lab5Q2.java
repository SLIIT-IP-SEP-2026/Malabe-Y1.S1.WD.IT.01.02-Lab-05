import java.util.Scanner;

    public class IT26102636Lab5Q2 {
		
		public static void main(String[] args){
		Scanner sc = new Scanner (System.in);

        System.out.print("Enter new member count: ");
        int numberOfMember = sc.nextInt();

        if(numberOfMember >= 5){
			System.out.print("Headphone");
		}else if(numberOfMember >= 4){
			System.out.print("Travelling Chair");
		}else if(numberOfMember >= 3){
			System.out.print("Bag");
		}else if (numberOfMember >= 2){
			System.out.print("Umbrella");
		}else if (numberOfMember >= 1){
			System.out.print("Pen");
		}else{
			System.out.print("No Price");
		}		
		
		}
	}