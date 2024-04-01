package model;

public class Product {
    public int id;
    public String name;
    public double price;
    public int quantity;
    public String description;

    public Product() {
    }

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateValueInStock() {
        return price * quantity;
    }

}
