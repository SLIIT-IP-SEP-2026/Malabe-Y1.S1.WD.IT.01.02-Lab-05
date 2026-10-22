import java.util.Scanner;
public class IT26102457Lab5Q3
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		
		
		double startdate;
		double enddate;
		double Totaldays;
		double discount;
		double total;
		double discountammount;
		
		
		System.out.print("Enter start Date(1-31) :");
		startdate=input.nextDouble();
		
		System.out.print("Enter End Date(1-31) :");
		enddate=input.nextDouble();
		
		Totaldays = enddate-startdate;
		
		if (startdate>enddate)
		{System.out.println("Error : Start Date must be less than End Date");}
	    
		else if(0>= startdate || startdate >=32 && 0>= enddate||enddate >=32 )
		{System.out.println("Error : Days must be between 1 and 31");}
	    
	
		
		
		
		else if (Totaldays<3)
		{System.out.println("Room charge Per Day : RS.48000.00/=");
	     System.out.println("Number of Days Reserved  :"+Totaldays);
		 System.out.println("Total Amount to be Paid :"+48000*Totaldays);}
		 
		 
		else if(Totaldays==3 || Totaldays==4)
		{discount=48000*Totaldays*10/100;
	     total=48000*Totaldays;
		 discountammount=total-discount;
		 System.out.println("Room charge Per Day : RS.48000.00/=");
	     System.out.println("Number of Days Reserved  :"+Totaldays);
	      System.out.println("Total Amount to be paid :"+discountammount);}
		  
		  
		  
		else
		  {discount=48000*Totaldays*10/100;
	     total=48000*Totaldays;
		 discountammount=total-discount;
		 System.out.println("Room charge Per Day : RS.48000.00/=");
	     System.out.println("Number of Days Reserved  :"+Totaldays);
	      System.out.println("Total Amount to be paid :"+discountammount);}
		  
			  
		
	}
}