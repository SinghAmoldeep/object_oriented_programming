package java_classes_and_objects.Level_1.M_phone_problem;

public class MobilePhone {
    String brand;
    String model;
    int price;

    MobilePhone(String brand , String model, int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    public void display(){
        System.out.println("Mobile Brand : " + brand);
        System.out.println("Mobile Model : " + model);
        System.out.println("Mobile Price : " + price);
    }

}