package AVTO;

import AVTO.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Car car1= new Car("lada","99",Car.TypeBody.СЕДАН);
        Car car2= new Car("lada","09",Car.TypeBody.СЕДАН);
        Car car3= new Car("lada","10",Car.TypeBody.СЕДАН);
        Bus bus1= new Bus("Hyunday","ajd555",Capacity.SMALL);
        Bus bus2= new Bus("Hyunday","777",Capacity.SMALL);
        Bus bus3= new Bus("Hyunday","ad8108",Capacity.SMALL);
        Trucks trucks1= new Trucks("GAZ","a345", WeightCargo.N2);
        Trucks trucks2= new Trucks("GAZ","sd897", WeightCargo.N2);
        Trucks trucks3= new Trucks("GAZ","yu908", WeightCargo.N2);
        Driver<Car> alex = new Driver<>("Alex", true, 10);
        DriverC<Trucks> igor = new DriverC<>("Igor",true,15);
        DriverD<Bus> ivan = new DriverD<>("Ivan",true,7);
        Mehanics mehanics1= new Mehanics<Car>("Stepan","Stepanovich","Turbo");
        Mehanics mehanics2= new Mehanics<Bus>("Vladimir","Stepanovich","Sport");
        Mehanics mehanics3= new Mehanics<Trucks>("Petr","Pavlovich","Live");
        Sponsor sponsor1= new Sponsor("Geka",150000);
        Sponsor sponsor2= new Sponsor("CTC",15000000);
        List<Transport> transports = List.of(car1, car2, bus3);

        car1.addAllDrivers(alex);
        car1.addAllSponsors(sponsor1,sponsor2);
        car1.addAllMechnics(mehanics1);
        for (Transport transport : transports){
            printInfo(transport);
        }

        TechStantion techStantion= new TechStantion();
        techStantion.addTechStation(car3);
        techStantion.addTechStation(car2);
        techStantion.addTechStation(trucks1);
        System.out.println(techStantion);
        techStantion.goTechInspection();
        System.out.println(techStantion);


        Car[] raseCar = {
                new Car("Toyota", "mark II", 1.8, 5.4, 2, 270, Car.TypeBody.СЕДАН),
                new Car("BMW", "x5", 1.5, 5.2, 1.02, 250, Car.TypeBody.ВНЕДОРОЖНИК),
                new Car("Porshe", "cayene", 2.0, 6, 3.42, 295, Car.TypeBody.СЕДАН),
                new Car("Lada", "2109", 1.3, 5.1, 1.7, 223, Car.TypeBody.СЕДАН)};

        Bus[] raseBus = {
                new Bus("Hyunday1", "a777", 1.7, 5.7, 1.4, 189, Capacity.SMALL ),
                new Bus("Hyunday", "2109", 1.3, 7.3, 1.8, 120, Capacity.SMALL),
                new Bus("Daewoo", "odd987", Capacity.SMALL),
                new Bus("Daewoo", "daa455", Capacity.SMALL)};

        Trucks[] raseTrucks = {
                new Trucks("Mercedes-Benz", "daa455", 12, 6.3, 2.8, 189, WeightCargo.N2),
                new Trucks("КАМАЗ", "O405", WeightCargo.N2),
                new Trucks("ГАЗ", "3307", 11.8, 8.8, 1.2, 199, WeightCargo.N2),
                new Trucks("Ford", "ff566", 12.3, 7.8, 2, 177, WeightCargo.N2)};

        System.out.println("В гонках принимают участие: \n АВТОБУСЫ");
        System.out.println(raseBus[0].toString());
        System.out.println(raseBus[1].toString());
        System.out.println(raseBus[2].toString());
        System.out.println(raseBus[3].toString());
        System.out.println(" \n ЛЕГКОВЫЕ МАШИНЫ");
        System.out.println(raseCar[0].toString());
        System.out.println(raseCar[1].toString());
        System.out.println(raseCar[2].toString());
        System.out.println(raseCar[3].toString());
        System.out.println("\n ГРУЗОВЫЕ МАШИНЫ");
        System.out.println(raseTrucks[0].toString());
        System.out.println(raseTrucks[1].toString());
        System.out.println(raseTrucks[2].toString());
        System.out.println(raseTrucks[3].toString());
        System.out.println("\n Гонка легковых машин");
        raseCar[2].bestTime();
        bestTime(raseCar);
        raseCar[2].goMaxSpeed();
        raseCar[2].goStart();
        raseCar[2].goEnd();
        raseCar[2].pitStop();
        System.out.println("\n Гонка автобусов");
        raseBus[1].bestTime();
        bestTime(raseBus);
        raseBus[1].goMaxSpeed();
        raseBus[1].goStart();
        raseBus[1].goEnd();
        raseBus[1].pitStop();


        System.out.println("\n Водители: \n "+alex.toString()+raseBus[1].getMarks()+" и будет участвовать в 1 заезде.");
        System.out.println(igor.toString()+raseCar[1].getMarks()+" и будет участвовать в 2 заезде.");
        System.out.println(ivan.toString()+raseBus[1].getMarks()+" и будет участвовать в 3 заезде.");
        System.out.println("Задание Enum");
        raseCar[2].printType();
        raseTrucks[3].printtypeMachine();
        raseBus[1].printtypeMachine();
        service2(raseCar);
        raseCar[2].printtypeMachine();


    }
    public static void  printInfo(Transport transport) {
        System.out.println("Машины : " + transport.getModel());
        System.out.println("Водители : "+ transport.getAllDrivers());//вар1
        System.out.println("Мехиники : ");
            for (Mehanics <?> mehanics : transport.getAllMechanic()) {//вар2
                System.out.println(mehanics.getName());
            }
            System.out.println("Спонсоры: ");
        for (Sponsor sponsor : transport.getAllSponsors() ) {
            System.out.println(sponsor.getName());

        }

    }

    public static void service (Car[] raseCar){
        for (Car i : raseCar) {
            if (!i.goDiagnostic()) {
                throw new RuntimeException("не прошел диагностику");
            }

        }
    }
    public static void service2 (Car[] raseCar){
        for (Car i : raseCar) {
            if (!i.goDiagnostic()) {
                try {
                throw new RuntimeException("не прошел диагностику");}
                catch (RuntimeException e){
                    System.out.println(e.getMessage());
                }
            }

        }
    }

    public static void bestTime(Car[] raseCar) {
        double min = 90000000;
        Car carBest = null;
        for (Car i : raseCar) {
            if (i == null)
                throw new IllegalArgumentException("The argument cannot be null");
            {
                if (i.getEndTime() < min) {
                    min = i.getEndTime();
                    carBest = i;
                }
            }
        }
        System.out.println("Победитель  " + carBest.getMarks() + " - гонщик проехал трассу за " + min + " мин.");
    }
    public static void bestTime(Bus[] raseBus) {
        double min = 90000000;
        Bus busBest = null;
        for (Bus i : raseBus) {
            if (i == null)
                throw new IllegalArgumentException("The argument cannot be null");
            {
                if (i.getEndTime() < min) {
                    min = i.getEndTime();
                    busBest = i;
                }
            }
        }
        System.out.println("Победитель  " + busBest.getMarks() + " - гонщик проехал трассу за " + min + " мин.");
    }
    public static void bestTime(Trucks[] raseTrucks) {
        double min = 90000000;
        Trucks trucksBest = null;
        for (Trucks i : raseTrucks) {
            if (i == null)
                throw new IllegalArgumentException("The argument cannot be null");
            {
                if (i.getEndTime() < min) {
                    min = i.getEndTime();
                    trucksBest = i;
                }
            }
        }
        System.out.println("Победитель  " + trucksBest.getMarks() + " - гонщик проехал трассу за " + min + " мин.");
    }


}