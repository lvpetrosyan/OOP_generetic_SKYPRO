package AVTO;

public class Bus extends Transport implements Competing {
    private Capacity capacity;
    private int maxSpeed;
    private static int counter = 1;
    private int id;


    public Bus(String marks, String model, double engineVolume, double startTime, double endTime, int maxSpeed, Capacity capacity) {
        super(marks, model, engineVolume, startTime, endTime);
        if (maxSpeed <= 0) {
            this.maxSpeed = 180;
        } else {
            this.maxSpeed = maxSpeed;
        }
        this.capacity = capacity;
        id = counter++;
    }

    public Bus(String marks, String model, Capacity capacity) {
        this(marks, model, 1.8, 5, 1.5, 180, capacity);
    }

    public Capacity getCapacity() {
        return capacity;
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

    public int getId() {
        return id;
    }

    @Override
    public void goStart() {
        System.out.println("Автобус стартовал за " + getStartTime() + " с.");

    }

    @Override
    public void goEnd() {
        System.out.println("Автобус пришел к финишу за " + getEndTime() + " мин.");

    }

    @Override
    public void printtypeMachine() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else System.out.println("Вместимость " + capacity.getFrom() + capacity.getTo());

    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп на 1 круге.");

    }

    @Override
    public void bestTime() {
        System.out.println("Победитель и результат гонки");

    }


    @Override
    public void goMaxSpeed() {
        System.out.println("Максимальная скорость - " + maxSpeed);

    }

    public static void goDiagnostic() {

        System.out.println("Автобусы не проходят диагностику");

    }

    @Override
    public String toString() {
        return "Участник " + getId() +
                ": марка " + getMarks() +
                ". Модель - " + getModel() +
                " объем двигателя " + getEngineVolume() +
                ". Проехал весь маршурт за " + getEndTime() + " вместимость ";
    }

}
