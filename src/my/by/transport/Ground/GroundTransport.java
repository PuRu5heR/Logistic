package my.by.transport.Ground;

import my.by.transport.Transport;

public class GroundTransport extends Transport {
    private boolean isGround;
    public GroundTransport(String name, double loadCapacity, double transportationPrice, double speed, int passengers) {
        super(name, loadCapacity, transportationPrice, speed, passengers);
        this.isGround = true;
    }

    public boolean getGround() {
        return isGround;
    }

    public void setGround(boolean ground) {
        isGround = ground;
    }
}
