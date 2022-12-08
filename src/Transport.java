public class Transport {
    private double loadCapacity;          //грузоподъёмность
    private double transportationPrice;   //цена транспортировки за км
    private double speed;                 //скорость км/ч
    private double passengers;            //количество пассажиров

    public Transport(double loadCapacity, double transportationPrice, double speed, double passengers) {
        this.loadCapacity = loadCapacity;
        this.transportationPrice = transportationPrice;
        this.speed = speed;
        this.passengers = passengers;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getTransportationPrice() {
        return transportationPrice;
    }

    public void setTransportationPrice(double transportationPrice) {
        this.transportationPrice = transportationPrice;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getPassengers() {
        return passengers;
    }

    public void setPassengers(double passengers) {
        this.passengers = passengers;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return "Transport\n" +
                "loadCapacity = " + loadCapacity +
                ",\ntransportationPrice = " + transportationPrice +
                ",\nspeed = " + speed +
                ",\npassengers = " + passengers;
    }
}
