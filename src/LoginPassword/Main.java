package LoginPassword;

public class Main {
    public static void main(String[] args) {
        boolean success = CorrectInfo.validateCheck("dfasdf","dfasdf","wwww");
        if (success){
            System.out.println("ok");
        }
        else {System.out.println("no ok");}
    }

}
