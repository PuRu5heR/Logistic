package my.by.transport.Water;

import my.by.transport.Transport;

public class WaterTransport extends Transport {
    private boolean isWater;

    public WaterTransport(String name, double loadCapacity, double transportationPrice, double speed, int passengers) {
        super(name, loadCapacity, transportationPrice, speed, passengers);
        this.isWater = true;
    }

    public boolean getWater() {
        return isWater;
    }

    public void setWater(boolean water) {
        isWater = water;
    }
}
