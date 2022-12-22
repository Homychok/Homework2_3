package homework;

import java.util.Objects;

public abstract class Transport {
    private String brand;
    private String model;
    private Integer year;
    private String country;
    private String backColor;
    private Integer maxVelocity;

    public Transport(String brand, String model, Integer year, String country, String backColor, Integer maxVelocity) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        setBackColor(backColor);
        setMaxVelocity(maxVelocity);
    }
    public void roadSistem() {
        System.out.println("Еду не менее " + getMaxVelocity());
    }
    public abstract void roadSistem2();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBackColor() {
        return backColor;
    }

    public Integer getMaxVelocity() {
        return maxVelocity;
    }

    public void setBackColor(String backColor) {
        if (backColor != null && !backColor.isEmpty() && !backColor.isBlank()) {
            this.backColor = backColor;
        }
    }

    public void setMaxVelocity(Integer maxVelocity) {
        if (maxVelocity != null) {
            this.maxVelocity = maxVelocity;
        }
        if (maxVelocity < 0) {
            this.maxVelocity = Math.abs(maxVelocity);
        }
    }
    @Override

    public String toString() {
        return "Машина - " + this.brand +
                " " + this.model +
                ", цвет кузова - " + this.backColor +
                ", год производства - " + this.year +
                ", страна производитель - " + this.country + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport transport = (Transport) o;
        return Objects.equals(getBrand(), transport.getBrand()) && Objects.equals(getModel(), transport.getModel()) && Objects.equals(getYear(), transport.getYear()) && Objects.equals(getCountry(), transport.getCountry()) && Objects.equals(getBackColor(), transport.getBackColor()) && Objects.equals(getMaxVelocity(), transport.getMaxVelocity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getYear(), getCountry(), getBackColor(), getMaxVelocity());
    }
}
