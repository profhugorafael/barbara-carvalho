import model.Product;

public class Main {
    public static void main(String[] args) {
        Product tshirt = new Product(1, "t shirt", 40.0, 10);
        Product tshirt2 = new Product();


        System.out.println(tshirt.name);
        System.out.println(tshirt.price);
        System.out.println(tshirt.quantity);
        System.out.println(tshirt.description);
        System.out.println(tshirt.calculateValueInStock());
    }
}


//        tshirt.name = "t shirt";
//        tshirt.price = 40.0;
//        tshirt.quantity = 10;
//        tshirt.description = "blue t shirt";