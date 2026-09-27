import java.util.Scanner;

public class RSVPMenu {
    public static void main(String[] args) {
        // Create scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt user for choice of meal
        System.out.print("Enter your choice of meal (c, f, or v): ");

        // Read the meal
        String meal = scanner.next();

        // If meal is "c"
        // Else, if meal is "f"
        // Else, if meal is "v"
        // Else, if invalid response
        if (meal.equalsIgnoreCase("c")) {
            System.out.println("You get the Chicken Parmesan.");
        } else if (meal.equalsIgnoreCase("f")) {
            System.out.println("You get the Roast Salmon.");
        } else if (meal.equalsIgnoreCase("v")) {
            System.out.println("You get the Butternut Squash.");
        } else {
            System.out.println("You have entered an invalid choice: " + meal);
        }
    }
}
