import java.util.Scanner;

public class Admin {
    Scanner sc = new Scanner(System.in);

    public void adminMenu() {
        while(true){
            System.out.println("=========================================");
            System.out.println("             ADMIN DASHBOARD             ");
            System.out.println("=========================================");
            System.out.println("1. Update Order Status");
            System.out.println("2. View All Orders");
            System.out.println("3. View Revenue Report");
            System.out.println("4. View Available Staff");
            System.out.println("5. Logout");
            System.out.println("=========================================");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Select a laundry order
                    // Choose a new order status:
                    // 1. Pending
                    // 2. In Progress
                    // 3. Ready for Pickup
                    // 4. Claimed
                    // Update the order status based on the selected option
                    break;
                case 2:
                    // Display all laundry orders
                    // Show customer name
                    // Show selected service
                    // Show laundry weight
                    // Show price per kilogram
                    // Show total price
                    // Show assigned staff
                    // Show current order status
                    break;
                case 3:
                    // Calculate total revenue from completed/claimed orders
                    //
                    // Example:
                    // totalRevenue = order1 + order2 + order3
                    //
                    // Use the + operator to add the order totals
                    // Display the total revenue
                    break;
                case 4:
                    // Display available laundry staff
                    // Show staff name
                    // Show current status:
                    // Available or Currently Working
                    break;
                case 5:
                    System.out.println("Logging out...");
                    return; // Exit the admin menu
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
