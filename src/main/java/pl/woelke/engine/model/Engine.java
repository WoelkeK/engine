package pl.woelke.engine.model;

public class Engine {

    private String type;
    private String brand;
    private int power;

    public Engine() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", power=" + power +
                '}';
    }
}
