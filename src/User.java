import java.util.Scanner;

public class User {
    Scanner sc = new Scanner(System.in);

    public void userMenu() {
        while(true){
            System.out.println("=========================================");
            System.out.println("             USER DASHBOARD              ");
            System.out.println("=========================================");
            System.out.println("1. Place New Order");
            System.out.println("2. View My Orders");
            System.out.println("3. Logout");
            System.out.println("=========================================");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Enter customer name
                    // Select laundry service
                    // Set the price per kilogram based on the selected service
                    //
                    // Example:
                    // Wash Only = P10.00/kg
                    // Wash & Dry = P20.00/kg
                    // Wash, Dry & Fold = P30.00/kg
                    // Wash, Dry, Fold & Iron = P35.00/kg
                    //
                    // Enter laundry weight in kg
                    // Calculate total price:
                    // totalPrice = weight * pricePerKg
                    //
                    // Example:
                    // 5 kg * P30.00 = P150.00
                    //
                    // Assign laundry staff
                    // Set order status to "Pending"
                    break;
                case 2:
                    // Display the customer's laundry order(s)
                    // Show customer name
                    // Show selected service
                    // Show laundry weight
                    // Show price per kilogram
                    // Show total price
                    // Show assigned staff
                    // Show current order status
                    break;
                case 3:
                    System.out.println("Logging out...");
                    return; // Exit the user menu
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
