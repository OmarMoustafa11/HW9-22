package HW2;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(3,6,2);
        Case case1 = new Case ("OtterBox","Sony","Durability", dimensions);
        MotherBoard motherBoard = new MotherBoard("SpaceX","Tesla",9,3,"Psyphy");
        Resolution resolution = new Resolution(3,6);
        Monitor monitor = new Monitor("MacBook Pro", "Apple",resolution);
        Pc pc = new Pc(case1,motherBoard,monitor);

        pc.description();
        pc.powerUp();
    }
}
