package my.by.Transport;

public class Transport {
    private String name;                  //название транспорта
    private double loadCapacity;          //грузоподъёмность в тоннах
    private double transportationPrice;   //цена транспортировки за км в долларах
    private double speed;                 //скорость км/ч
    private double passengers;            //максимальное количество пассажиров

    public Transport(String name, double loadCapacity, double transportationPrice, double speed, double passengers) {
        this.name = name;
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
        return "Name: " + name +
                "\nMax load capacity = " + loadCapacity +
                "\nPrice of transportation = " + transportationPrice +
                "\nMax speed = " + speed +
                "\nMax amount of passengers = " + passengers;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
