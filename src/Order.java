public class Order {

    // Shared order information used by both User and Admin

    String customerName = "";
    String service = "";
    String status = "";
    String assignedStaff = "";

    double weight = 0.0;
    double pricePerKg = 0.0;
    double totalPrice = 0.0;

    boolean orderCreated = false;

    // Shared staff info
    String[] staffNames = {"John", "Mark", "Alex"};
    String[] staffStatus = {"Available", "Available", "Available"};

}