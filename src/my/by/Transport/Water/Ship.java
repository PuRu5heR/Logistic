package my.by.Transport.Water;

import my.by.Transport.Water.WaterTransport;

public class Ship extends WaterTransport {
    public Ship(String name, double loadCapacity, double transportationPrice, double speed, double passengers) {
        super(name, loadCapacity, transportationPrice, speed, passengers);
    }
}
