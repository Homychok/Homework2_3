package homework;

public class Bus extends Transport{

    public Bus(String brand, String model, Integer year, String country, String backColor, Integer maxVelocity) {
        super(brand, model, year, country, backColor, maxVelocity);
    }
    @Override
    public void roadSistem2() {
        System.out.println("Еду не только по ровной дороге.");
    }
    public void makeStops() {
//        super.makeStops();
        System.out.println("Еду только с остановками");
    }
}
