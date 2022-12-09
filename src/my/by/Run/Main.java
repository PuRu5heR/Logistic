package my.by.Run;

import my.by.City.City;
import my.by.Transport.Ground.Bus;

public class Main {
    public static void main(String[] args){
        City city = new City("Minsk", true, true, 10, 10);
        System.out.println(city);
        Bus bus = new Bus("Bus", 10, 10, 10, 10);
        System.out.println();
        System.out.println(bus);
    }
}
