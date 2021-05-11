package TemaOOPAlexUio2;

public abstract class Iphone implements Phone {
    private boolean isOn = false;
    private int batteryLife = 20;
    private String name;
    private String color;
    private String material;


    public Iphone(String name, String color, String material) {
        this.name = name;
        this.color = color;
        this.material = material;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String getName() {
        return name;
    }
}

