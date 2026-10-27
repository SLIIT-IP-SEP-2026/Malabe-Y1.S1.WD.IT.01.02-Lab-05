
import java.util.Scanner;

public class IT26102686Lab5Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		double startDate;
		double endDate;
		double noOfDays;
        double roomChargePerDay = 48000.00;
        double discount;
		double totalDiscount;
		double totalAmountPay;

        System.out.print("Enter start date(1-31): ");
        startDate = input.nextInt();

        System.out.print("Enter end date(1-31): ");
        endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Invalid date");

        } else if (startDate >= endDate) {

            System.out.println("Start date should be less than end date");

        } else {
            noOfDays = endDate - startDate;

				if(noOfDays >= 5){
					   discount = 0.2;
				   }
				   
				else if(noOfDays >= 3){
					discount = 0.1;
					} 

				else{
					discount = 0.0;
					} 	
			
			totalDiscount = noOfDays * roomChargePerDay * discount;
			totalAmountPay = noOfDays * roomChargePerDay - totalDiscount;
			
			System.out.println();
			System.out.println("Room charge per day: " + roomChargePerDay);
            System.out.println("Number of days reserved: " + noOfDays);
            System.out.println("Total amount to be paid: " + totalAmountPay);
        }

        input.close();
    }
}
