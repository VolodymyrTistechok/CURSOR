package product;

import interfaces.Buyable;

public class Product implements Buyable {
    private String name;
    private double price;
    private int quantity;
    private ageRestriction restriction;

    public Product(String name, double price, int quantity, ageRestriction restriction) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.restriction = restriction;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public ageRestriction getRestriction() {
        return restriction;
    }

    @Override
    public String toString() {
        return  name +
                ", price=" + price +
                ", quantity=" + quantity +
                ", restriction=" + restriction +
                " ";
    }
}