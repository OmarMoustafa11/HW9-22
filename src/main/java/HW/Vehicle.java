package HW;

import HW.Product;

public abstract class Vehicle extends Product {
    private int qty;
    private Engine engine;

    private double price;

    private float speed;

    private final  double Tax = .15;




    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }


    public double getTax() {
        return Tax;
    }

    public Vehicle(String name, int qty, double price, float speed, Engine engine){
        super(name);
        this.qty = qty;
        this.price = price;
        this.speed = speed;
        this.engine = engine;
    }
    public Vehicle(String name, int qty, double price, float speed){
        super(name);
        this.qty = qty;
        this.price = price;
        this.speed = speed;

}

public double totalBeforeTax(Vehicle vehicle){
        return qty * price;
}
public double calculateTax(){
        return qty * price * Tax;
}

public abstract void totalAfterTax(Vehicle vehicle);



}
