package my.by.run;

import my.by.city.City;
import my.by.transport.Air.Airplane;
import my.by.transport.Ground.Track;
import my.by.transport.Transport;
import my.by.services.Services;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //белорусские города
        City minsk = new City("Минск", true, false, 53.9, 27.5667);
        City vitebsk = new City("Витебск", true, false, 55.1904, 30.2049);
        City gomel = new City("Гомель", true, false, 52.4345, 30.9754);
        City mogilev = new City("Могилёв", true, false, 53.9168, 30.3449);
        City grodno = new City("Гродно", true, false, 53.6884, 23.8258);
        City brest = new City("Брест", true, false, 52.0975, 23.6877);

        //российские города
        City moscow = new City("Москва", true, false, 55.7522, 37.6156);
        City saintPetersburg = new City("Санкт-Петербург", true, true, 59.9386, 30.3141);
        City kaliningrad = new City("Калининград", true, true, 54.7065, 20.511);
        City novosibirsk = new City("Новосибирск", true, false, 55.0415, 82.9346);
        City ekatetinburg = new City("Екатеринбург", true, false, 56.8519, 60.6122);
        City vladivostok = new City("Владивосток", true, true, 43.1056, 131.874);

        //украинские города
        City kiev = new City("Киев", true, false, 50.4547, 30.5238);
        City odessa = new City("Одесса", true, true, 46.48253, 30.72331);
        City lviv = new City("Львов", true, false, 49.8383, 24.0232);

        City[] cities = {minsk, vitebsk, gomel, mogilev, grodno, brest, moscow, saintPetersburg, kaliningrad,
        novosibirsk, ekatetinburg, vladivostok, kiev, odessa, lviv};

        //самолёты
        Airplane boeing737Passenger = new Airplane("Boeing 737-800", 1.5, 2526, 850, 186);
        Airplane boeing737Cargo = new Airplane("Boeing 737BCF", 23, 3000, 850, 0);
        Airplane boeing747Passenger = new Airplane("Boeing 747-400D", 0, 12000,933, 660);
        Airplane boeing747Cargo = new Airplane("Boeing 747-400F", 128.5, 12000,933, 0);

        //фуры
        Track volvoFH16 = new Track("Volvo FH16 750",325, 22.68, 90, 0);

        Transport[] transports = {boeing737Cargo, boeing747Cargo, boeing737Passenger, boeing747Passenger, volvoFH16};

        boolean run = true;
        String option;
        while (run){
            int number = 1;
            for (City city : cities){
                System.out.println(number + ") " + city.getName());
                number++;
            }
            System.out.println();
            System.out.print("Введите номер города отправления: ");
            number = scanner.nextInt();
            City departureCity = cities[number - 1];
            System.out.print("Введите номер города доставки: ");
            number = scanner.nextInt();
            City arrivalCity = cities[number - 1];
            System.out.print("Введите вес груза: ");
            double load = scanner.nextDouble();
            System.out.print("Введите количество пассажиров: ");
            int passengers = scanner.nextInt();
            System.out.println();


            Transport[] bestTransports = Services.findingBestTransport(transports, load, passengers, departureCity, arrivalCity);
            System.out.println("Самый быстрый: ");
            System.out.println(bestTransports[0]);
            System.out.println();
            System.out.println("Самый дешёвый: ");
            System.out.println(bestTransports[1]);

            //выход
            System.out.print("Введите '0' для выхода: ");
            option = scanner.next();
            if (option.equals("0")){
                run = false;
            }
        }
    }
}
