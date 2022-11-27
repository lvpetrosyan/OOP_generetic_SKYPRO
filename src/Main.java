public class Main {
    public static void main(String[] args) {
    //    Car[] raseCar = {
       //        new Car("Toyota", "mark II", 1.8, 5.4, 2,270),
           // new Car("BMW", "x5", 1.5, 5.2, 1.02,250),
             //  new Car("Porshe", "cayene", 2.0, 6, 3.42,295),
               //new Car("Lada", "2109", 1.3, 5.1, 1.7,223)};

        Car car1= new Car("Toyota", "mark II", 1.8, 5.4, 2,302);
        Car car2= new Car("BMW", "x5", 1.5, 5.2, 1.02,195);
        Car car3= new Car("Porshe", "cayene", 2.0, 6, 3.42,264);
        Car car4= new Car("Lada", "2109", 1.3, 5.1, 1.7,247);
        Bus bus1 = new Bus("Hyunday", "a777", 1.7,5.7,1.4,189);
        Bus bus2 = new Bus("Hyunday", "2109", 1.3,7.3,1.8,120);
        Bus bus3 = new Bus("Daewoo", "odd987");
        Bus bus4 = new Bus("Daewoo", "daa455");
        Trucks avto1 = new Trucks("Mercedes-Benz", "daa455", 12,6.3,2.8,189);
        Trucks avto2 = new Trucks("КАМАЗ", "O405");
        Trucks avto3 = new Trucks("ГАЗ", "3307", 11.8,8.8,1.2,199);
        Trucks avto4 = new Trucks("Ford", "ff566", 12.3,7.8,2,177);
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(bus1.toString());
        System.out.println(bus2.toString());
        System.out.println(bus3.toString());
        System.out.println(bus4.toString());
        System.out.println(avto1.toString());
        System.out.println(avto2.toString());
        System.out.println(avto3.toString());
        System.out.println(avto4.toString());
        car1.goMaxSpeed();
        bus2.goStart();
        bus2.goEnd();
        avto1.pitStop();
        Driver<Car> alex=new Driver<>("Алекс", true, 10);


    }

}