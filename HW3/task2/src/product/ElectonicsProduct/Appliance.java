package product.ElectonicsProduct;

import product.ageRestriction;

public class Appliance extends ElectonicsProduct {
    public Appliance(String name, double price, int quantity, ageRestriction restriction, int guaranteePeriod) {
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
