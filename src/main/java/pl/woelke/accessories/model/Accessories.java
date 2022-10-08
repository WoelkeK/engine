package pl.woelke.accessories.model;

public class Accessories {

    private String gear;
    private String controller;
    private String battery;
    private boolean acCompressor;

    public Accessories() {
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public boolean isAcCompressor() {
        return acCompressor;
    }

    public void setAcCompressor(boolean acCompressor) {
        this.acCompressor = acCompressor;
    }

    @Override
    public String toString() {
        return "Accessories{" +
                "gear='" + gear + '\'' +
                ", controller='" + controller + '\'' +
                ", battery='" + battery + '\'' +
                ", acCompressor=" + acCompressor +
                '}';
    }
}
