package purchaseManager;

import product.FoodProduct;
import product.Product;
import customer.Customer;
import product.ageRestriction;

public class PurchaseManager {

    public static void processPurchase(Customer customer, Product product) {
            if (product.getQuantity()<=0) {
                throw new RuntimeException("the product is not available");
            }
             if (product instanceof FoodProduct) {
                 if (((FoodProduct)product).getPrice() == 0) {
                     throw new RuntimeException("The " + product.getName() + " has expired");
                 }
             }
            if (customer.getAge() < 18 && product.getRestriction().equals(ageRestriction.Teenager)) {
                throw new RuntimeException("You are too young to buy this product!");
            }
            double newBalance = customer.getBalance() - product.getPrice();
            int newQuantity = product.getQuantity() - 1;
            if (newBalance < 0) {
                throw new RuntimeException("You do not have enough money to buy this product!");
            }
            customer.setBalance(newBalance);
            product.setQuantity(newQuantity);
    }

}
