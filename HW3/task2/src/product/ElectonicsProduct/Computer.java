package product.ElectonicsProduct;

import product.ageRestriction;

public class Computer extends ElectonicsProduct{
    public Computer(String name, double price, int quantity, ageRestriction restriction) {
        super(name, price, quantity, restriction, 24);
    }

    @Override
    public double getPrice() {
        if (super.getQuantity()>1000){
            return super.getPrice() * 0.95;
        }else {
            return super.getPrice();
        }
    }
}
