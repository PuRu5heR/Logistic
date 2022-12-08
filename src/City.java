public class City {
    private boolean hasAirport;    //наличие аэропорта
    private boolean hasPort;       //наличие порта
    private boolean x;             //координата города по x
    private boolean y;             //координата города по y

    public City(boolean hasAirport, boolean hasPort, boolean x, boolean y) {
        this.hasAirport = hasAirport;
        this.hasPort = hasPort;
        this.x = x;
        this.y = y;
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

    public boolean getX() {
        return x;
    }

    public void setX(boolean x) {
        this.x = x;
    }

    public boolean getY() {
        return y;
    }

    public void setY(boolean y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "City" +
                "\nhasAirport = " + hasAirport +
                "\nhasPort = " + hasPort +
                "\nx = " + x +
                "\ny = " + y;
    }

}
