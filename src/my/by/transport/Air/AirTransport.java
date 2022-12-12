package my.by.transport.Air;

import my.by.transport.Transport;

public class AirTransport extends Transport {
    private boolean isAir;
    public AirTransport(String name, double loadCapacity, double transportationPrice, double speed, int passengers) {
        super(name, loadCapacity, transportationPrice, speed, passengers);
        this.isAir = true;
    }

    public boolean getAir() {
        return isAir;
    }

    public void setAir(boolean air) {
        isAir = air;
    }
}
