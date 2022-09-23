package HW;

public class Truck extends Vehicle {

    public Truck(String name, int qty, double price, float speed, Engine engine) {
        super(name, qty, price, speed, engine);
    }



    @Override
    public void totalAfterTax(Vehicle truck) {
        System.out.println(totalBeforeTax(truck)+calculateTax());

    }


}
