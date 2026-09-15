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
                    // Look up an order and change its status:
                    // Pending, In Progress, Ready to pickup, or Claimed
                    break;
                case 2:
                    // Display all laundry orders with
                    // customer, service, weight, price, assigned staff, and status
                    break;
                case 3:
                    // Compute and display total revenue (e.g. from Claimed orders)
                    break;
                case 4:
                    // Display all staff members along with their current status
                    // (e.g. Available or Currently Working on an order)
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
