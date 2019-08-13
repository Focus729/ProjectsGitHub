package Glava.number4.vehicles;

public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    //методы
    int range() {
        return mpg * fuelcap;
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}
