package HW;

import HW.Rideable;

public class RollerCoaster implements Rideable {

    private double price;

    private float speed;
    private final double tax = .20;

    public RollerCoaster(double price, float speed){
        this.speed = speed;
        this.price = price;
    }


    @Override
    public int milesPerHour() {
        return (int)
                this.speed;
    }
}
