package entity;

public class Customer extends User {
    public Customer(String id, String name) {
        super(id, name);
    }

    @Override
    public void displayUserType() {
        System.out.println("Customer: " + getName());
    }
}
