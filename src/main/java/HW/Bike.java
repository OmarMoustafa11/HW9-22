package HW;

public class Bike extends Vehicle implements Rideable {

    public Bike(String name, int qty, double price, float speed) {
        super(name, qty, price, speed);
    }

    @Override
    public void totalAfterTax(Vehicle bike) {
        System.out.println(totalBeforeTax(bike) + calculateTax());
    }
    @Override
    public int milesPerHour(){
        return (int)
        this.getSpeed();
    }
}
