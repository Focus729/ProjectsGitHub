package Glava.number4.vehicles;

public class MainClass {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportcar = new Vehicle(2,14,12);
        double gallons;
        int dest = 252;

        //расчитать дальность поездки при полном баке
        gallons = minivan.fuelneeded(dest);

        System.out.println("Для преодяления " + dest + " миль мини-фургону требуется "
                + gallons + " галлонов топлива.");

        gallons = sportcar.fuelneeded(dest);
        System.out.println("Для преодяления " + dest + " миль спортивному автомобилю требуется "
                + gallons + " галлонов топлива.");

    }
}
