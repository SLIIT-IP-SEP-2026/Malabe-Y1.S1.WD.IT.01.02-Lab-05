import java.util.Scanner;

public class IT26102000Lab5Q3{

public static void main(String[] args){

//variable declaration
 final double chargePerDay = 48000;
                    
 int startDay, endDay, numberOfDays; 
 double  total, discount, finalAmount, discountRate;
 
 //Scanner object creation
 Scanner sc = new Scanner(System.in);
 
 //Getting input fron keyboard
 System.out.print("Enter start date (1-31): ");
 startDay = sc.nextInt();
 
 System.out.print("Enter end date (1-31): "); 
 endDay = sc.nextInt();

 System.out.println("");

//Checking validation	
 if(startDay > endDay ){
   System.out.print("Error: Start date must be less than end date.");
   return;
 }
 else if(startDay <= 0 || startDay > 31 || endDay <= 0 || endDay > 31){
   System.out.print("Error: Days must be between 1 and 31");
   return;
   }
    
  System.out.println("Room charge per day: Rs. 48000.0/= ");
  numberOfDays = endDay - startDay ;
  System.out.println("Number of days reserved: "+numberOfDays);
  total = numberOfDays * chargePerDay;
  
//Deciding discount rate based on number of days reserved  
  if(numberOfDays < 3){
    System.out.println("Total amount to be paid: "+total);
    return;
  }
  
  else if(numberOfDays >= 5){
   discountRate = 20;
  }

  else{
  discountRate = 10;  
  }
 
 
   discount = total * discountRate/100;
   finalAmount = total - discount;
   
   
   System.out.println("Total amount to be paid: " + finalAmount);
 
}

}