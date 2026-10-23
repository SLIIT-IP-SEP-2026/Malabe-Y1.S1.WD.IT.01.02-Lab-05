import java.util.Scanner;

public class IT26102492Lab5Q2 {
    public static void main(String[] args) {

        int numberOfNewMembers;
        String prize;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of new members: ");
        numberOfNewMembers = input.nextInt();

        // Validate the number entered
        if (numberOfNewMembers < 0) {
            System.out.println("Invalid number. The number should be greater than or equal to 0.");
        } else {
            // Find the prize using a switch statement
            switch (numberOfNewMembers) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
                    break;
            }

            System.out.println("Prize: " + prize);
        }

        input.close();
    }
}