public class Driver < B extends Transport & Competing> {
    private String name;
    private boolean skill;
    private int experience;


    public Driver(String name, boolean skill, int experience) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "Anonim";
        } else {
            this.name = name;}
        this.skill = skill;
        if (experience <= 0) {
            this.experience = 5;
        } else {
            this.experience = experience;
        }
    }

    public Driver(String name) {
        this(name, true,5);
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
        System.out.println("Подготавливает машину.");
        System.out.println("Включает мотор.");
        System.out.println("Едет.");
    }
    public static void stopCar(){
        System.out.println("Нажимает на педаль тормоза.");
        System.out.println("Машина останавливается.");
    }
    public static void fillCar(){
        System.out.println("Приезжает на заправку.");
        System.out.println("Заправляет.");
    }
}
