import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("=========================================");
            System.out.println(" LAUNDRY SERVICE ORDER MANAGEMENT SYSTEM ");
            System.out.println("=========================================");
            System.out.println("1. LOGIN");
            System.out.println("2. SIGN UP");
            System.out.println("3. EXIT");
            System.out.println("=========================================");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1: {
                    System.out.println("================= LOGIN =================");
                    System.out.print("Enter your username: ");
                    String username = sc.next();
                    System.out.print("Enter your password: ");
                    String password = sc.next();

                    if (username.contains("admin")) {
                        Admin admin = new Admin();
                        admin.adminMenu();
                    } else {
                        User user = new User();
                        user.userMenu();
                    }
                    break;
                }
                case 2: {
                    System.out.println("================ SIGN UP ================");
                    System.out.print("Enter Username: ");
                    String username = sc.next();
                    System.out.print("Password: ");
                    String password = sc.next();

                    String role = "User"; // Default role for new users

                    System.out.println("Account created successfully!");
                    System.out.println("Username: " + username);
                    System.out.println("Role: " + role);
                    break;
                }
                case 3:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}