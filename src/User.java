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
                    // Select a service package, enter weight, and compute the total price
                    break;
                case 2:
                    // Display this customer's order(s) and current status
                    // (e.g. Pending / In Progress / Ready for Pickup / Claimed)
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
