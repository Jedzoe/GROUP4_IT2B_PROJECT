import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] role = new String[10];
        String[] username = new String[10];
        String[] password = new String[10];

        int accountCount = 0;
        Order order = new Order();

        while (true) {
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
                    String loginUsername = sc.next();
                    System.out.print("Enter your password: ");
                    String loginPassword = sc.next();

                    boolean found = false;

                    for (int i = 0; i < accountCount; i++) {
                        if (loginUsername.equals(username[i]) && loginPassword.equals(password[i])) {

                            found = true;

                            if (role[i].equals("Admin")) {
                                System.out.println("Admin login successful!");
                                Admin admin = new Admin(order);
                                admin.adminMenu();
                            } else if (role[i].equals("User")) {
                                System.out.println("User login successful!");
                                User user = new User(order);
                                user.userMenu();
                            }
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Invalid username or password.");
                    }

                    break;
                }

                case 2: {
                    System.out.println("================ SIGN UP ================");
                    System.out.println("1. Create Admin Account");
                    System.out.println("2. Create User Account");
                    System.out.print("Enter your choice: ");
                    int subChoice = sc.nextInt();

                    switch (subChoice) {
                        case 1:
                            System.out.print("Enter Admin Code: ");
                            String adminCode = sc.next();

                            if (!adminCode.equals("ADMIN123")) {
                                System.out.println("Invalid admin code. Please try again.");
                                break;
                            }

                            System.out.print("Enter new admin username: ");
                            username[accountCount] = sc.next();
                            System.out.print("Enter new admin password: ");
                            password[accountCount] = sc.next();

                            role[accountCount] = "Admin";
                            accountCount++;

                            System.out.println("Admin account created successfully!");
                            break;
                        case 2:
                            System.out.print("Enter new user username: ");
                            username[accountCount] = sc.next();
                            System.out.print("Enter new user password: ");
                            password[accountCount] = sc.next();

                            role[accountCount] = "User";
                            accountCount++;

                            System.out.println("User account created successfully!");
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
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