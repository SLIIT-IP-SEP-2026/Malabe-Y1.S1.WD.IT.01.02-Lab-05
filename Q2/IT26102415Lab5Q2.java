import java.util.Scanner;

public class IT26102415Lab5Q2{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the number of new members introduced: ");
        int members=input.nextInt();

        if (members<0){
            System.out.println("Invalid !should be greater than or equal to 0.");
        } else {
            

            switch(members){
                case 0:
                    System.out.println("prize is:No prize ");
                    break;
                case 1:
                    System.out.println("prize is a :Pen");
                    break;
                case 2:
                    System.out.println("prize is:Umbrella");
                    break;
                case 3:
                    System.out.println("prize is:Bag");
                    break;
                case 4:
                    System.out.println("prize is:Travelling Chair");
                    break;
                default:
                    System.out.println("Headphone");
                    break;
            }
        }
    }
}