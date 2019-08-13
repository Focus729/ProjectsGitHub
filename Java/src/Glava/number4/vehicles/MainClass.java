package Glava.number4.vehicles;

public class MainClass {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();
        double gallons;
        int dest = 252;
        //присвоение
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;
        //расчитать дальность поездки при полном баке
        gallons = minivan.fuelneeded(dest);

        System.out.println("Для преодяления " + dest + " миль мини-фургону требуется "
                + gallons + " галлонов топлива.");

        gallons = sportcar.fuelneeded(dest);
        System.out.println("Для преодяления " + dest + " миль спортивному автомобилю требуется "
                + gallons + " галлонов топлива.");

    }
}
