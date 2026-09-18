import java.util.Scanner;

public class Admin {
    Scanner sc = new Scanner(System.in);
    Order order;

    public Admin(Order order) {
        this.order = order;
    }

    public void adminMenu() {
        while (true) {
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
                    if (!order.orderCreated) {
                        System.out.println("No Laundry Order Found.");
                        break;
                    }

                    System.out.println("========== UPDATE ORDER STATUS ==========");
                    System.out.println("Customer Name: " + order.customerName);
                    System.out.println("Current Status: " + order.status);

                    System.out.println("\nSelect New Status:");
                    System.out.println("1. Pending");
                    System.out.println("2. In Progress");
                    System.out.println("3. Ready for Pickup");
                    System.out.println("4. Claimed");
                    System.out.print("Enter status choice: ");

                    int statusChoice = sc.nextInt();

                    if (statusChoice == 1) {
                        order.status = "Pending";
                    } else if (statusChoice == 2) {
                        order.status = "In Progress";
                    } else if (statusChoice == 3) {
                        order.status = "Ready for Pickup";
                    } else if (statusChoice == 4) {
                        order.status = "Claimed";

                        // Free up the staff member who handled this order
                        for (int i = 0; i < order.staffNames.length; i++) {
                            if (order.staffNames[i].equals(order.assignedStaff)) {
                                order.staffStatus[i] = "Available";
                            }
                        }
                    } else {
                        System.out.println("Invalid status choice.");
                        break;
                    }

                    System.out.println("Order status updated successfully!");
                    System.out.println("New Status: " + order.status);
                    break;

                case 2:
                    System.out.println("============ ALL ORDERS ============");
                    if (!order.orderCreated) {
                        System.out.println("No laundry orders found.");
                    } else {
                        System.out.println("Customer Name: " + order.customerName);
                        System.out.println("Service: " + order.service);
                        System.out.println("Weight: " + order.weight + " kg");
                        System.out.println("Price per kg: P" + order.pricePerKg);
                        System.out.println("Total Price: P" + order.totalPrice);
                        System.out.println("Assigned Staff: " + order.assignedStaff);
                        System.out.println("Status: " + order.status);
                    }
                    break;

                case 3:
                    System.out.println("============ REVENUE REPORT ============");
                    if (!order.orderCreated) {
                        System.out.println("No completed orders found.");
                    } else if (order.status.equals("Claimed")) {
                        System.out.println("Customer: " + order.customerName);
                        System.out.println("Total Order: P" + order.totalPrice);
                        System.out.println("Total Revenue: P" + order.totalPrice);
                    } else {
                        System.out.println("No claimed orders yet.");
                        System.out.println("Current order status: " + order.status);
                    }
                    break;

                case 4:
                    System.out.println("========== AVAILABLE STAFF ==========");
                    for (int i = 0; i < order.staffNames.length; i++) {
                        System.out.println((i + 1) + ". " + order.staffNames[i] + " - " + order.staffStatus[i]);
                    }
                    break;

                case 5:
                    System.out.println("Logging out...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}