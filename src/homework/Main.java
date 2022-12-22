package homework;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 2015, "Russia", "black", 180);
        Car lada2 = new Car("Lada", "Granta2.0", 2022, "Russia", "white", 160);
        System.out.println(lada + "\n" + lada2);
        Bus bus1 = new Bus("Wolkswagen", "Sprinter", 2019, "Germany", "white", 120);
        Bus bus2 = new Bus("Wolkswagen","Sprinter", 2020, "Germany", "black", 125);
        Bus bus3 = new Bus("Wolkswagen", "Sprinter", 2022, "Germany", "silver", 150);
        System.out.println(bus1 + "\n" + bus2 + "\n" + bus3 + "\n" + lada2);
        System.out.println(lada.hashCode() + "\n" + bus1.hashCode() + "\n" + bus2.hashCode() + "\n" + bus3.hashCode() + "\n" + lada2.hashCode());
        System.out.println(bus1.equals(bus2));
        bus1.roadSistem();
        lada.roadSistem();
        bus1.roadSistem2();
        lada.roadSistem2();
        lada.makeStops();
        bus2.makeStops();
        lada.addTransport(bus1);   //добавляем к ладе в парк бас1
        lada.addTransport(bus2);
        lada.addTransport(bus3);
        lada.addTransport(lada2);

        for (Transport addToTransportPark : lada.getAddToTransportPark()) {
            if (addToTransportPark instanceof Car) {         // проверяет принадлежность car к addTransportPark
                Car car = (Car) addToTransportPark;
                car.roadSistem();
            } else if (addToTransportPark instanceof Bus) {
                ((Bus) addToTransportPark).roadSistem2();
            } else {
                System.out.println(addToTransportPark);
            }
        }
    }
}
