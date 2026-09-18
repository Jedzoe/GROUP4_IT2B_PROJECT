import java.util.Scanner;

public class User {
    Scanner sc = new Scanner(System.in);
    Order order;

    public User(Order order) {
        this.order = order;
    }

    public void userMenu() {
        while (true) {
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
                    System.out.println("============ PLACE NEW ORDER ============");
                    System.out.print("Enter customer name: ");
                    order.customerName = sc.next();

                    System.out.println("\nSelect Laundry Service:");
                    System.out.println("1. Wash Only - P10/kg");
                    System.out.println("2. Wash & Dry - P20/kg");
                    System.out.println("3. Wash, Dry & Fold - P30/kg");
                    System.out.println("4. Wash, Dry, Fold & Iron - P35/kg");
                    System.out.print("Enter service choice: ");
                    int serviceChoice = sc.nextInt();

                    if (serviceChoice == 1) {
                        order.service = "Wash Only";
                        order.pricePerKg = 10;
                    } else if (serviceChoice == 2) {
                        order.service = "Wash & Dry";
                        order.pricePerKg = 20;
                    } else if (serviceChoice == 3) {
                        order.service = "Wash, Dry & Fold";
                        order.pricePerKg = 30;
                    } else if (serviceChoice == 4) {
                        order.service = "Wash, Dry, Fold & Iron";
                        order.pricePerKg = 35;
                    } else {
                        System.out.println("Invalid service choice.");
                        break;
                    }

                    System.out.print("Enter laundry weight (kg): ");
                    order.weight = sc.nextDouble();

                    if (order.weight <= 0) {
                        System.out.println("Invalid weight. Order cancelled.");
                        break;
                    }

                    order.totalPrice = order.weight * order.pricePerKg;

                    // ---- Staff selection by number ----
                    System.out.println("\nSelect a Staff:");
                    for (int i = 0; i < order.staffNames.length; i++) {
                        System.out.println((i + 1) + ". " + order.staffNames[i] + " - " + order.staffStatus[i]);
                    }
                    System.out.print("Enter staff number: ");
                    int staffChoice = sc.nextInt();

                    if (staffChoice < 1 || staffChoice > order.staffNames.length) {
                        System.out.println("Invalid staff number.");
                        break;
                    }

                    int staffIndex = staffChoice - 1;

                    if (order.staffStatus[staffIndex].equals("Busy")) {
                        System.out.println(order.staffNames[staffIndex] + " is currently busy. Please choose another staff.");
                        break;
                    }

                    order.assignedStaff = order.staffNames[staffIndex];
                    order.staffStatus[staffIndex] = "Busy";

                    order.status = "Pending";
                    order.orderCreated = true;

                    System.out.println("Laundry order created successfully!");
                    System.out.println("Assigned Staff: " + order.assignedStaff);
                    System.out.println("Total Price: P" + order.totalPrice);
                    System.out.println("Status: " + order.status);
                    break;

                case 2:
                    System.out.println("=============== MY ORDERS ===============");
                    if (!order.orderCreated) {
                        System.out.println("No orders placed yet.");
                        break;
                    }
                    System.out.println("Customer Name: " + order.customerName);
                    System.out.println("Selected Service: " + order.service);
                    System.out.println("Laundry Weight: " + order.weight + " kg");
                    System.out.println("Price per Kilogram: P" + order.pricePerKg);
                    System.out.println("Total Price: P" + order.totalPrice);
                    System.out.println("Assigned Staff: " + order.assignedStaff);
                    System.out.println("Current Order Status: " + order.status);
                    break;

                case 3:
                    System.out.println("Logging out...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}