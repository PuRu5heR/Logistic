package my.by.city;

public class City implements ICity{
    private String name;
    private boolean hasAirport;                  //наличие аэропорта
    private boolean hasPort;                     //наличие порта
    private double latitudePosition;             //координата города по широте
    private double longitudePosition;            //координата города по долготе

    public City(String name, boolean hasAirport, boolean hasPort, double latitudePosition, double longitudePosition) {
        this.name = name;
        this.hasAirport = hasAirport;
        this.hasPort = hasPort;
        this.latitudePosition = latitudePosition;
        this.longitudePosition = longitudePosition;
    }

    public boolean getHasAirport() {
        return hasAirport;
    }

    public void setHasAirport(boolean hasAirport) {
        this.hasAirport = hasAirport;
    }

    public boolean getHasPort() {
        return hasPort;
    }

    public void setHasPort(boolean hasPort) {
        this.hasPort = hasPort;
    }

    public double getLatitudePosition() {
        return latitudePosition;
    }

    public void setLatitudePosition(double latitudePosition) {
        this.latitudePosition = latitudePosition;
    }

    public double getLongitudePosition() {
        return longitudePosition;
    }

    public void setLongitudePosition(double longitudePosition) {
        this.longitudePosition = longitudePosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Название города: " + name +
                "\nНаличие аэропорта = " + hasAirport +
                "\nНаличие порта = " + hasPort +
                "\nШирота = " + latitudePosition +
                "\nДолгота = " + longitudePosition);
    }
}
