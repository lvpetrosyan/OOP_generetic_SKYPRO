public class Main {
    public static void main(String[] args) {
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
                new Trucks("КАМАЗ", "O405",WeightCargo.N2),
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
        Driver<Car> alex = new Driver<>("Alex", true, 10);
        DriverC<Trucks> igor = new DriverC<>("Igor",true,15);
        DriverD<Bus> ivan = new DriverD<>("Ivan",true,7);

        System.out.println("\n Водители: \n "+alex.toString()+raseBus[1].getMarks()+" и будет участвовать в 1 заезде.");
        System.out.println(igor.toString()+raseCar[1].getMarks()+" и будет участвовать в 2 заезде.");
        System.out.println(ivan.toString()+raseBus[1].getMarks()+" и будет участвовать в 3 заезде.");
        System.out.println("Задание Enum");
        raseCar[2].printType();
        raseTrucks[3].printtypeMachine();
        raseBus[1].printtypeMachine();


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