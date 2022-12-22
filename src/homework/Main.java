package homework;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 2015, "Russia", "black", 180);
        System.out.println(lada);
        Bus bus1 = new Bus("Wolkswagen", "Sprinter", 2019, "Germany", "white", 120);
        Bus bus2 = new Bus("Wolkswagen","Sprinter", 2020, "Germany", "black", 125);
        Bus bus3 = new Bus("Wolkswagen", "Sprinter", 2022, "Germany", "silver", 150);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(lada.hashCode());
        System.out.println(bus1.hashCode());
        System.out.println(bus2.hashCode());
        System.out.println(bus3.hashCode());
        System.out.println(bus1.equals(bus2));
        bus1.roadSistem();
        lada.roadSistem();
        bus1.roadSistem2();
        lada.roadSistem2();
        lada.makeStops();
        bus2.makeStops();
    }
}
