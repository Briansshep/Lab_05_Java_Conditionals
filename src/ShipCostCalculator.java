import java.util.Scanner;

    public class ShipCostCalculator {
        public static void main(String[] args) {
            // Create scanner
            Scanner scanner = new Scanner(System.in);

            // Prompt use for price
            System.out.print("What is the price of the item: $");

            // Read the price
            double price = scanner.nextDouble();

            double shipping;

            // If price >= 100, shipping = 0
            // Else, shipping = price * .02
            if (price >= 100) {
                shipping = 0;
            } else {
                shipping = price * .02;
            }

            // Total = price + shipping
            double total = price + shipping;

            // Print the shipping cost
            System.out.println("Your shipping cost: $" + shipping);

            // Print the total
            System.out.println("The total price: $" + total);
        }
    }

