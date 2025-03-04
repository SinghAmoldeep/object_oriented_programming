package constructors_and_access_modifiers.level2.product_inventory;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("shoes", 5000);
        Product p2 = new Product("Laptop", 50000);
        p1.productDetails();
        p2.productDetails();
        System.out.println(Product.TotalProduct());
    }
}