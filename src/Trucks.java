
public class Trucks extends Transport implements Competing{
    private int maxSpeed;
    public Trucks(String marks, String model, double engineVolume, double  endTime, double startTime, int maxSpeed) {
        super(marks, model, engineVolume,endTime, startTime);
        if (maxSpeed <= 0) {
            this.maxSpeed = 180;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }
    public Trucks(String marks, String model){
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
        System.out.println("Грузовая машина стартовала за "+getStartTime()+" с.");

    }

    @Override
    public void goEnd() {
        System.out.println("Грузовая машина пришла к финишу за "+getEndTime()+" мин.");

    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп на 3 круге.");

    }

    @Override
    public void bestTime() {

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
