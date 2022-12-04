import java.util.Arrays;

public class Car extends Transport implements Competing {
    public enum TypeBody {СЕДАН, ХЭТЧБЭК,КУПЕ, УНИВЕРСАЛ, ВНЕДОРОЖНИК, КРОССОВЕР, ПИКАП, ФУРГОН, МИНИВЭН}
    private int maxSpeed;
    private static int counter = 1;
    private int id;

    private final TypeBody typeBody;

    public Car(String marks, String model, double engineVolume, double startTime, double endTime, int maxSpeed, TypeBody typeBody ) {
        super(marks, model, engineVolume, startTime, endTime);
        if (maxSpeed <= 0) {
            this.maxSpeed = 180;
        } else {
            this.maxSpeed = maxSpeed;
        }
        this.typeBody=typeBody;
        id = counter++;
    }

    public Car(String marks, String model, TypeBody typeBody) {
        this(marks, model, 1.8, 5, 1.5, 180,typeBody );
        id = counter++;
    }

    public TypeBody getTypeBody() {
        return typeBody;
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
        System.out.println("Машина стартовала за " + getStartTime() + " с.");

    }

    @Override
    public void goEnd() {
        System.out.println("Машина пришла к финишу за " + getEndTime() + " мин.");

    }

    @Override
    public void printtypeMachine() {
        if (typeBody== null){System.out.println("Данных по транспортному средству недостаточно");}
        else System.out.println("Тип авто: "+ typeBody);
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп на 2 круге.");

    }


    @Override
    public void bestTime() {
        System.out.println("Победитель и результат гонки");

    }


    @Override
    public void goMaxSpeed() {
        System.out.println("Максимальная скорость - " + maxSpeed);

    }


    public void printType () {System.out.println(
        "Тип кузова " +
                getMarks() + " "+getTypeBody());
    }
}
