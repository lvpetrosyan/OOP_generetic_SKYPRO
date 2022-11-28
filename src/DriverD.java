import java.util.Objects;

public class DriverD < D extends Bus & Competing>{
    private String name;
    private boolean skill;
    private int experience;


    public DriverD(String name, boolean skill, int experience) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "Anonim";
        } else {
            this.name = name;}
        this.skill = skill;
        if (experience <= 0) {
            this.experience = 7;
        } else {
            this.experience = experience;
        }
    }

    public DriverD(String name) {
        this(name, true,7);
    }

    public boolean isSkill() {
        return skill;
    }

    public void setSkill(boolean skill) {
        this.skill = skill;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience <= 0) {
            this.experience = 5;
        } else {
            this.experience = experience;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "Anonim";
        } else {
            this.name = name;}
    }

    public static void startMoving(){
        System.out.println("Подготавливает автобус.");
        System.out.println("Включает мотор.");
        System.out.println("Едет.");
    }
    public static void stopCar(){
        System.out.println("Нажимает на педаль тормоза.");
        System.out.println("Машина останавливается.");
    }
    public static void fillCar(){
        System.out.println("Приезжает на заправку.");
        System.out.println("Заправляет дизелем.");
    }
    @Override
    public String toString() {
        return "Водитель "  + getName() + " будет управлять автомобилем ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DriverD<?> driverD = (DriverD<?>) o;
        return skill == driverD.skill && experience == driverD.experience && Objects.equals(name, driverD.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, skill, experience);
    }
}

