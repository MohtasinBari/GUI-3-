package entity;

public class BookingInfo {
    private String customerId;
    private String customerName;
    private String airline;
    private String travelClass;
    private int amount;

    public BookingInfo(String customerId, String customerName, String airline, String travelClass, int amount) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.airline = airline;
        this.travelClass = travelClass;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return customerId + "," + customerName + "," + airline + "," + travelClass + "," + amount + " BDT";
    }
}
