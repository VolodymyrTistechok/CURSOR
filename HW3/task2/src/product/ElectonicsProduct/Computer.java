package product.ElectonicsProduct;

import product.AgeRestriction;

public class Computer extends ElectonicsProduct{
    public Computer(String name, double price, int quantity, AgeRestriction restriction) {
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
