package my.by.transport;

public class Transport {
    private String name;                  //название транспорта
    private double loadCapacity;          //грузоподъёмность в тоннах
    private double transportationPrice;   //цена транспортировки за км в долларах
    private double speed;                 //скорость км/ч
    private int passengers;            //максимальное количество пассажиров
    private boolean isAir = false;
    private boolean isWater;
    private boolean isGround;
    private double usingSpace;
    private int usingSeats;

    public Transport(String name, double loadCapacity, double transportationPrice,
                     double speed, int passengers) {
        this.name = name;
        this.loadCapacity = loadCapacity;
        this.transportationPrice = transportationPrice;
        this.speed = speed;
        this.passengers = passengers;
        this.isAir = false;
        this.isWater = false;
        this.isGround = false;
        this.usingSpace = 0;
        this.usingSeats = 0;
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
        return "Название: " + name +
                "\nМаксимальная грузоподъёмность: " + loadCapacity + " т" +
                "\nЦена транспортировки: " + transportationPrice + " $/км" +
                "\nМаксимальная скорость: " + speed + " км/ч" +
                "\nМаксимальное количество пассажиров: " + passengers +
                "\nЗанято места: " + usingSpace + " т" +
                "\nСвободно места: " + (loadCapacity - usingSpace) + " т" +
                "\nЗанято мест пассажиров: " + usingSeats +
                "\nСвободно мест пассажиров: " + (passengers - usingSeats);
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

    public double getUsingSpace() {
        return usingSpace;
    }

    public void setUsingSpace(double usingSpace) {
        this.usingSpace = usingSpace;
    }

    public int getUsingSeats() {
        return usingSeats;
    }

    public void setUsingSeats(int usingSeats) {
        this.usingSeats = usingSeats;
    }
}
