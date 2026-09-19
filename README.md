"Laundry Service Order Management System"

## About
A Java console prototype that simulates a laundry shop's order process. Users can sign up, log in, place an order,
and check its status. Admins can log in, update order status, view revenue, and check staff availability.

## How to Run

1. Download or clone the repository.
2. Open the project using a Java IDE such as IntelliJ IDEA.
3. Open the `src` folder.
4. Run `Main.java`.
5. The system will open in the console.

## How to Use

1. From the main menu, choose **Sign Up** to create an Admin account (code: `ADMIN123`) or a User account.
2. Choose **Login** and enter your username and password.
3. As a **User**: place a new order by selecting a service, entering weight,
   and choosing an available staff member, then view your order anytime.
5. As an **Admin**: update the order status, view order details, check staff availability,
   and view the revenue report.
7. Once an order is marked **Claimed**, the assigned staff member becomes available again,
   and the order is included in the revenue report.

## Note
This is a prototype — it currently handles one active order at a time.
