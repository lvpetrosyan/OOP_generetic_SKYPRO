
public class Trucks extends Transport implements Competing{
    private WeightCargo weightCargo;

    private int maxSpeed;
    private static int counter = 1;
    private int id;
    public Trucks(String marks, String model, double engineVolume,  double startTime, double  endTime, int maxSpeed, WeightCargo weightCargo) {
        super(marks, model, engineVolume, startTime, endTime);
        if (maxSpeed <= 0) {
            this.maxSpeed = 180;
        } else {
            this.maxSpeed = maxSpeed;
        }
        this.weightCargo=weightCargo;
        id=counter++;
    }
    public Trucks(String marks, String model, WeightCargo weightCargo){
        this(marks, model,1.8,5,1.5,180, weightCargo);

    }

    public WeightCargo getWeightCargo() {
        return weightCargo;
    }

    public int getId() {
        return id;
    }

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
        System.out.println("Грузовая машина стартовала за "+getStartTime()+" с.");

    }

    @Override
    public void goEnd() {
        System.out.println("Грузовая машина пришла к финишу за "+getEndTime()+" мин.");

    }

    @Override
    public void printtypeMachine() {
            if (weightCargo== null){System.out.println("Данных по транспортному средству недостаточно");}
            else {
                System.out.println("Грузоподъемность авто: "+ weightCargo.getFrom()+" "+weightCargo.getTo());}
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп на 3 круге.");

    }

    @Override
    public void bestTime() {
        System.out.println("Победитель и результат гонки");

    }


    @Override
    public void goMaxSpeed() {
        System.out.println("Максимальная скорость - "+maxSpeed);

    }
    @Override
    public String toString() {
        return "Участник " + getId()+
                ": марка " + getMarks() +
                ". Модель - " + getModel() +
                " объем двигателя " + getEngineVolume() +
                ". Проехал весь маршурт за "+ getEndTime();
    }
}
