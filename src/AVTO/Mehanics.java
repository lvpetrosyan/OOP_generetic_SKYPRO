package AVTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mehanics <T extends Transport> {
    private String name;
    private String lastName;
    private String company;


    public Mehanics(String name, String lastName, String company) {
        this.name = name;
        this.lastName = lastName;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }
    public void service(T avto){
        System.out.println("Обслужить машину "+avto);
    }
    public void repair(){
        System.out.println("Чинить машину");
    }




}
