package constructors_and_access_modifiers.level2.product_inventory;

public class Product {
    private String productName;
    private int price;
    private static int totalProduct;
    Product(String productName, int price){
        this.productName = productName;
        this.price = price;
        totalProduct++;
    }
    public void productDetails(){
        System.out.println("Product Name: " + productName + "Price: " + price);
    }
    public static int TotalProduct(){
        return totalProduct;
    }
}