package AVTO;

public class Sponsor {
    private String name;
    private int money;

    public Sponsor(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }
    public void toSponsors(){
        System.out.println("Спонсировать заезд на сумму: "+ money);
    }

}
