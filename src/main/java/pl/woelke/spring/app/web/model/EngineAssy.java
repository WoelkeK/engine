package pl.woelke.spring.app.web.model;

public class EngineAssy {

    private String brand;
    private String type;
    private int power;

    public EngineAssy() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "EngineAssy{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", power=" + power +
                '}';
    }
}
