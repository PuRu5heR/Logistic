package my.by.services;

import my.by.city.City;
import my.by.transport.Transport;

public class Services {
    public static Transport[] checkLoadCapacity(Transport[] transports, double load){     //проверка на грузоподъёмность
        Transport[] checked = new Transport[transports.length];
        int i = 0;
        for (Transport transport : transports){
            if (transport.getLoadCapacity() >= load){
                checked[i] = transport;
            }
            i++;
        }
        return checked;
    }

    public static Transport checkPrice(Transport[] transports){                           //нахождения дешёвого варианта
        Transport lowestPrice = transports[0];
        for (Transport transport : transports){
            if (transport.getTransportationPrice() < lowestPrice.getTransportationPrice()){
                lowestPrice = transport;
            }
        }
        return lowestPrice;
    }

    public static Transport checkSpeed(Transport[] transports, City departureCity, City arrivalCity){                           //нахождение быстрого варианта
        Transport fastest = transports[0];
        int[] none = new int[transports.length];
        for (int i = 0; i < transports.length; i++){
            none[i] = -1;
        }
        if (distanceCount(departureCity, arrivalCity) <= 250){
            for (int i = 0; i < transports.length; i++){
                if (transports[i].getAir()){
                    none[i] = i;
                    continue;
                }
                fastest = transports[i];
            }
        }
        for (int i = 0; i < transports.length; i++){
            if (i == none[i]){
                continue;
            }
            if (transports[i].getSpeed() > fastest.getSpeed()){
                fastest = transports[i];
            }
        }
        return fastest;
    }

    public static Transport[] checkPassengers(Transport[] transports, int passengers){   //проверка на вместимость пассажиров
        Transport[] checked = new Transport[transports.length];
        int i = 0;
        for (Transport transport : transports){
            if (transport.getPassengers() >= passengers){
                checked[i] = transport;
            }
            i++;
        }
        return checked;
    }

    public static double distanceCount(City departureCity, City arrivalCity){
        double kmToDegree = 111.134861111;
        return Math.sqrt(Math.abs(departureCity.getLatitudePosition() - arrivalCity.getLatitudePosition()) +
                Math.abs(departureCity.getLongitudePosition() - arrivalCity.getLongitudePosition())) * kmToDegree;
    }

    public static Transport[] findingBestTransport(Transport[] transports, double load, int passengers,
                                                   City departureCity, City arrivalCity){  //нахождение лучших вариантов для перевозки
        Transport[] checkedLoad = checkLoadCapacity(transports, load);
        Transport[] checkedPassengers = checkPassengers(checkedLoad, passengers);
        Transport fastestTransport = checkSpeed(checkedPassengers, departureCity, arrivalCity);
        Transport cheapestTransport = checkPrice(checkedPassengers);
        return new Transport[]{fastestTransport, cheapestTransport};
    }
}
