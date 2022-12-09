package my.by.Transport.Ground;

import my.by.Transport.Ground.GroundTransport;

public class Track extends GroundTransport {
    public Track(String name, double loadCapacity, double transportationPrice, double speed, double passengers) {
        super(name, loadCapacity, transportationPrice, speed, passengers);
    }
}
