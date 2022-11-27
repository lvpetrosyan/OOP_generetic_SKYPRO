import java.util.Arrays;

public class Car extends Transport implements Competing{
    public Car [] raseCar;
    private int maxSpeed;
    public Car(String marks, String model, double engineVolume,double  endTime, double startTime, int maxSpeed) {
        super(marks, model, engineVolume,   endTime, startTime);
        if (maxSpeed <= 0) {
            this.maxSpeed = 180;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }
    public Car(String marks, String model){
        this(marks, model,1.8,5,1.5,180);}

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = 180;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    @Override
    public void goStart() {
        System.out.println("Машина стартовала за "+getStartTime()+" с.");

    }

    @Override
    public void goEnd() {
        System.out.println("Машина пришла к финишу за "+getEndTime()+" мин.");

    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп на 2 круге.");

    }
    public  Car[] addRaseCar() {
        if (raseCar==null){
            raseCar= new Car[0];
        }
        return raseCar;
    }
    public void addCar(Car  raseCars) {
        Car [] raseCar= new Car[addRaseCar().length+1];
        this.raseCar= Arrays.copyOf(this.raseCar, addRaseCar().length+1);
        this.raseCar[this.raseCar.length-1]= raseCars;}

    @Override
    public void bestTime (){
            double min = 90000000;
            Car carBest=null;
            for (Car i : raseCar) {
                if (i == null)
                    throw new IllegalArgumentException("The argument cannot be null");
                {
                    if (i.getEndTime() < min) {
                        min = i.getEndTime();
                        carBest=i;
                    }
                }
            }
        System.out.println("Победитель  " + carBest.getMarks() + " - " + min);
        }


    @Override
    public void goMaxSpeed() {
        System.out.println("Максимальная скорость - "+maxSpeed);

    }
    @Override
    public String toString() {
        return "Траснспорт: " +
                " марка " + getMarks() +
                ". Модель - " + getModel() +
                " объем двигателя " + getEngineVolume() +
                ". Проехал весь маршурт за "+ getEndTime();
    }
}
