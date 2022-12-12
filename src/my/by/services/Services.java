package my.by.services;

import my.by.transport.Transport;

public class Services {
    public static Transport[] checkLoadCapacity(Transport[] transports, double load){
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

    public static Transport checkPrice(Transport[] transports){
        Transport lowestPrice = transports[0];
        for (Transport transport : transports){
            if (transport.getTransportationPrice() < lowestPrice.getTransportationPrice()){
                lowestPrice = transport;
            }
        }
        return lowestPrice;
    }

    public static Transport checkSpeed(Transport[] transports){
        Transport fastest = transports[0];
        for (Transport transport : transports){
            if (transport.getSpeed() > fastest.getSpeed()){
                fastest = transport;
            }
        }
        return fastest;
    }

    public static Transport[] checkPassengers(Transport[] transports, int passengers){
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

    public static Transport[] findingBestTransport(Transport[] transports, double load, int passengers){
        Transport[] checkedLoad = checkLoadCapacity(transports, load);
        Transport[] checkedPassengers = checkPassengers(checkedLoad, passengers);
        Transport fastestTransport = checkSpeed(checkedPassengers);
        Transport cheapestTransport = checkPrice(checkedPassengers);
        return new Transport[]{fastestTransport, cheapestTransport};
    }
}
