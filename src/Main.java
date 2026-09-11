import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Order information
    String customerName = "";
    String service = "";
    String status = "";
    String assignedStaff = "";

    double pricePerkg = 0;
    double weight = 0;
    double totalPrice = 0;
    boolean orderCreated = false;

    while(true){
        System.out.println("===========================================");
        System.out.println("  LAUNDRY SERVICE ORDER MANAGEMENT SYSTEM  ");
        System.out.println("===========================================");
        System.out.println("1. Create Laundry Order");
        System.out.println("2. View Laundry Orders");
        System.out.println("3. Update Order Status");
        System.out.println("4. Exit");
        System.out.println("===========================================");
        System.out.print("Choose an option (1-4): ");
        int choice = scanner.nextInt();

        switch(choice){

            case 1:
                System.out.print("Enter Customer Name: ");
                customerName = scanner.next();

                System.out.println("========== SELECT LAUNDRY SERVICE =========");
                System.out.println("1. Wash Only - P10.00/kg");
                System.out.println("2. Wash & Dry - P20.00/kg");
                System.out.println("3. Wash, Dry & Fold - P30.00/kg");
                System.out.println("4. Wash, Dry, Fold & Iron - P35.00/kg");
                System.out.println("===========================================");
                System.out.print("Choose a service (1-4): ");
                int serviceChoice = scanner.nextInt();

                if(serviceChoice == 1){
                    service = "Wash Only";
                    pricePerkg = 10.00;
                }else if(serviceChoice == 2){
                    service = "Wash & Dry";
                    pricePerkg = 20.00;
                }else if(serviceChoice == 3){
                    service = "Wash, Dry & Fold";
                    pricePerkg = 30.00;
                }else if(serviceChoice == 4){
                    service = "Wash, Dry, Fold & Iron";
                    pricePerkg = 35.00;
                }else{
                    System.out.println("Invalid service choice. Please try again.");
                    break;
                }

                System.out.print("Enter Laundry Weight (in kg): ");
                weight = scanner.nextDouble();

                totalPrice = weight * pricePerkg;

                System.out.print("Enter Assigned Staff: ");
                assignedStaff = scanner.next();

                status = "Pending";
                orderCreated = true;

                System.out.println("Laundry order created successfully!");
                break;

            case 2:
                System.out.println("============ VIEW LAUNDRY ORDER ===========");
                if(orderCreated){
                    System.out.println("Customer: " + customerName);
                    System.out.println("Service: " + service);
                    System.out.println("Weight: " + weight + " kg");
                    System.out.println("Total Price: P" + totalPrice);
                    System.out.println("Status: " + status);
                    System.out.println("Assigned Staff: " + assignedStaff);
                }else{
                    System.out.println("No laundry orders found.");
                }

                break;

            case 3:
                System.out.println("========== UPDATE ORDER STATUS ==========");
                if(orderCreated){
                    System.out.println("1. Pending");
                    System.out.println("2. In Progress");
                    System.out.println("3. Ready for Pickup");
                    System.out.println("4. Claimed");

                    System.out.print("Choose a new status (1-4): ");
                    int statusChoice = scanner.nextInt();

                    if(statusChoice == 1){
                        status = "Pending";
                    }else if (statusChoice == 2){
                        status = "In Progress";
                    }else if(statusChoice == 3){
                        status = "Ready for Pickup";
                    }else if (statusChoice == 4){
                        status = "Claimed";
                    }else{
                        System.out.println("Invalid status choice. Please try again.");
                        break;
                    }

                    System.out.println("Order status updated to " + status);

                }else{
                    System.out.println("No laundry orders found.");
                }

                break;

            case 4:
                System.out.println("Exiting the program. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}