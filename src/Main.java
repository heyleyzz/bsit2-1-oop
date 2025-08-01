import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Enter Number 1: ");
            int number1 = input.nextInt();
            System.out.println("Enter Number 2: ");
            int number2 = input.nextInt();
            System.out.println("Enter Number 3: ");
            int number3 = input.nextInt();
            System.out.println("Enter Number 4: ");
            int number4 = input.nextInt();
            System.out.println("Enter Number 5: ");
            int number5 = input.nextInt();

            int totalNumbers = number1 + number2 + number3 + number4 + number5;
            System.out.println("Total Number: " + totalNumbers);

            System.out.print("\nDo you want to try again? (yes/no): ");
            input.nextLine();
            choice = input.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Program ended.");
    }
}