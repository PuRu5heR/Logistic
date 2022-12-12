package my.by.transport;

public class Transport {
    private String name;                  //название транспорта
    private double loadCapacity;          //грузоподъёмность в тоннах
    private double transportationPrice;   //цена транспортировки за км в долларах
    private double speed;                 //скорость км/ч
    private int passengers;            //максимальное количество пассажиров
    private boolean isAir;
    private boolean isWater;
    private boolean isGround;

    public Transport(String name, double loadCapacity, double transportationPrice, double speed, int passengers) {
        this.name = name;
        this.loadCapacity = loadCapacity;
        this.transportationPrice = transportationPrice;
        this.speed = speed;
        this.passengers = passengers;
        this.isAir = false;
        this.isWater = false;
        this.isGround = false;
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

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
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

    public boolean getAir() {
        return isAir;
    }

    public void setAir(boolean air) {
        isAir = air;
    }

    public boolean getWater() {
        return isWater;
    }

    public void setWater(boolean water) {
        isWater = water;
    }

    public boolean getGround() {
        return isGround;
    }

    public void setGround(boolean ground) {
        isGround = ground;
    }
}
