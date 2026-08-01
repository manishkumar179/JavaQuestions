import java.util.Scanner; // Import the Scanner class to take user input

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter the weight of the package
        // Read the weight input from the user
        double weight = scanner.nextDouble(); 
        
        // Consume the leftover newline character
        scanner.nextLine(); 
        // Read the delivery speed input from the user
        String deliverySpeed = scanner.nextLine(); 

        // Check if the weight of the package is within the allowed limit
        if (weight <= 5) {
            // Check if the delivery speed is "Express"
            if (deliverySpeed.equalsIgnoreCase("Express")) {
                System.out.println("Shipping charge: $15"); // Print the charge for Express delivery
            } else { 
                // If the delivery speed is "Standard"
                System.out.println("Shipping charge: $10"); // Print the charge for Standard delivery
            }
        } else { 
            // If the weight exceeds the allowed limit
            System.out.println("Shipping not available for packages above 5 kg."); // Print an error message
        }

        scanner.close(); // Close the Scanner object to prevent resource leaks
    }
}
