package homework;

import java.util.Arrays;

public class Car extends Transport{
    private static int count;

    public static int getCount() {
        return count;
    }
    protected String brand;
    protected String model;
    protected String backColor;
    protected Integer year;
    protected String country;
    private Transport[] addToTransportPark;

    public Car(String brand, String model, Integer year, String country, String backColor, Integer maxVelocity) {
        super(brand, model, year, country, backColor, maxVelocity);

        addToTransportPark = new  Transport[0];
        count++;
    }

    public Transport[] getAddToTransportPark() {
            if (addToTransportPark == null) {
                addToTransportPark = new Transport[0];
            }
        return addToTransportPark;
    }
    public void addTransport(Transport addToTransportPark) {
        this.addToTransportPark = Arrays.copyOf(getAddToTransportPark(), getAddToTransportPark().length + 1);
        this.addToTransportPark[this.addToTransportPark.length - 1] = addToTransportPark;
    }
    @Override
    public void roadSistem2() {
        System.out.println("Еду только по ровной дороге.");
    }
}
