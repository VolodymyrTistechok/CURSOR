package product.ElectonicsProduct;

import product.AgeRestriction;

public class Appliance extends ElectonicsProduct {
    public Appliance(String name, double price, int quantity, AgeRestriction restriction, int guaranteePeriod) {
        super(name, price, quantity, restriction, 6);
    }

    @Override
    public double getPrice() {
        if (super.getQuantity()<50){
            return super.getPrice() * 1.05;
        }else {
            return super.getPrice();
        }
    }
}
