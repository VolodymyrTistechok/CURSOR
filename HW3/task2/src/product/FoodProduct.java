package product;

import interfaces.Expirable;

import java.time.ZonedDateTime;


public class FoodProduct extends Product implements Expirable {
    private MyDate expirationDate;

    public FoodProduct(String name, double price, int quantity, AgeRestriction restriction, MyDate expirationDate) {
        super(name, price, quantity, restriction);
        this.expirationDate = expirationDate;
    }

    @Override
    public MyDate getExpirationDate() {
        return expirationDate;
    }

    @Override
    public double getPrice() {
        if (expirationDate.getYear() < ZonedDateTime.now().getYear()) {
            return 0;
        } else if (expirationDate.dayOfYear() - ZonedDateTime.now().getDayOfYear() > 0) {
            if (expirationDate.dayOfYear() - ZonedDateTime.now().getDayOfYear() <= 15) {
                return super.getPrice() * 0.7;
            } else {
                return super.getPrice();
            }
        } else return 0;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "expirationDate=" + expirationDate;
    }
}
