package HW;

import HW.Bike;
import HW.Car;
import HW.Engine;
import HW.Horse;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(4);

        Car car = new Car("Benzy",1,60,200,engine);
        Truck truck = new Truck("Birtha",1,200,110,engine);
        Bike bike = new Bike("Speedy",1,20,180);
        Horse horse = new Horse("Fiona",1,4,1);
        RollerCoaster rollerCoaster = new RollerCoaster(3,30);
        Vehicle[] vehicles = {car,truck,bike,horse};
        Rideable[] rideables = { horse,rollerCoaster,bike};
        VehicleApp.printVehicleNameAndPrice(vehicles);
        VehicleApp.printSpeedOfAnRideableObjects(rideables);
        for( Vehicle i : vehicles){
            System.out.println(i.totalBeforeTax(vehicles[3]));
        }

        for( Vehicle i : vehicles){

            i.totalAfterTax(vehicles[3]);
        }


    }
}
