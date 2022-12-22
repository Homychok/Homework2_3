package homework;

public class Car extends Transport{
    protected String brand;
    protected String model;
    protected String backColor;
    protected Integer year;
    protected String country;

    public Car(String brand, String model, Integer year, String country, String backColor, Integer maxVelocity) {
        super(brand, model, year, country, backColor, maxVelocity);
    }
 @Override
    public void roadSistem2() {
        System.out.println("Еду только по ровной дороге.");
    }
}
