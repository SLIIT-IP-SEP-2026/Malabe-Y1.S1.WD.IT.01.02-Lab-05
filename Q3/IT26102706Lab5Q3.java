import java.util.Scanner;

public class IT26102706Lab5Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31.");
        } 
        else if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
        } 
        else {
            
            int numberOfDaysReserved = endDate - startDate;
            int roomChargedPerDay = 48000;
            int totalAmountToBePaid = numberOfDaysReserved * roomChargedPerDay;

           
            System.out.println("Number of Days Reserved: " + numberOfDaysReserved);
            System.out.println("Total Amount to be Paid: " + totalAmountToBePaid);
        }

       
    }
}