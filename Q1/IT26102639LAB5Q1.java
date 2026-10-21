import java.util.Scanner;
public class IT26102639LAB5Q1
 {
     public static void main(String[] args)
	 {
Scanner input = new Scanner(System.in);
		 int firstinteger,secondinteger,thirdinteger,smallest , largest ;
		 
		  System.out.print("Enter a first integer:");
		 firstinteger = input.nextInt();
		 
		 System.out.print("Enter a second integer:");
		 secondinteger = input.nextInt();
 
        System.out.print("Enter a third integer:");
		 thirdinteger = input.nextInt();
		 
		 
 smallest = firstinteger;
		 largest = firstinteger;
		 if (secondinteger< smallest){
			 smallest = secondinteger;
			 
		 }
		 if (secondinteger> largest){
			 largest = secondinteger;
			 
		 }
		 if (thirdinteger< smallest){
			 smallest = thirdinteger;
			 
		 }
		 if (thirdinteger> largest){
			 largest = thirdinteger;
			 
		 }
		 System.out.println();
          System.out.println("user entered number are :"+firstinteger +" " +secondinteger+" "+ thirdinteger);
           System.out.println("Enter the largest:"+largest);
           System.out.println("Enter the smallest:"+smallest);
 
 
 
 
     }
 
 }