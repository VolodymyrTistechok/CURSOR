import customer.Customer;
import product.ElectonicsProduct.Computer;
import product.FoodProduct;
import product.MyDate;
import product.AgeRestriction;
import purchaseManager.PurchaseManager;

public class Test {
    public static void main(String[] args) {
        FoodProduct banana = new FoodProduct("banana",23.30,4, AgeRestriction.None,new MyDate(1,4,2021));
        Computer HP = new Computer("HP",1055,600, AgeRestriction.None);
        FoodProduct cigars = new FoodProduct("420 Blaze it fgt", 6.90, 1400, AgeRestriction.Adult, new MyDate(10,12,2021));
        System.out.println(banana.getExpirationDate());
        System.out.println(banana.getPrice());
        System.out.println(banana);
        System.out.println(HP);
        Customer pecata = new Customer("Pecata", 17, 30.00);
        Customer gopeto = new Customer("Gopeto", 18, 0.44);

        try {
            PurchaseManager.processPurchase(pecata,banana);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            PurchaseManager.processPurchase(pecata, cigars);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            PurchaseManager.processPurchase(gopeto, cigars);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
