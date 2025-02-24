public class Slice_o_Heaven {
    public String storeAddress;
    private String storeMenu;
    public String storeHours;
    public long storePhone;
    public String storeEmail;
    public String storeWebsite;
    public String storeName;
    private String orderID;
    private String orderDetails;
    private double orderTotal;

    public void takeOrder(String id, String details, double total) {
        orderID = id;
        orderDetails = details;
        orderTotal = total;

        System.out.println("Order accepted!");

        System.out.println("Order is being prepared");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Order is ready for pickup!");
        }

        System.out.println("Your order is ready!");

        printReceipt();
    }

    private void printReceipt() {
        System.out.println("------ Order Receipt ------");
        System.out.println("Order ID: " + orderID);
        System.out.println("Order Details: " + orderDetails);
        System.out.println("Order Total: " + orderTotal);
    }
    public static void main(String[] args) {
        Slice_o_Heaven slice = new Slice_o_Heaven();
        slice.takeOrder("***", "Pizza and drink", 20.00);
    }
}