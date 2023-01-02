package Products;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;

public class Product {
    private String name;
    private double price;
    private double weight;

    public Product(String name, double price, double weight) {
        if (name.isEmpty()|| name==null){
        System.out.println("Заполните карточку товара полностью");}
        else {
        this.name = name;}
        if (price==0){
            System.out.println("Заполните карточку товара полностью");}
        else {
            this.price = price;}
        if (weight==0){
            System.out.println("Заполните карточку товара полностью");}
        else {
            this.weight = weight;}
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()|| name==null){
            System.out.println("Заполните карточку товара полностью");}
        else {
            this.name = name;
    }}

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price==0){
            System.out.println("Заполните карточку товара полностью");}
        else {
            this.price = price;}
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight==0){
            System.out.println("Заполните карточку товара полностью");}
        else {
            this.weight = weight;}
    }

    public static void buyProduct(Product product){
        System.out.println("Товар куплен- "+ product.getName());
    }

        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && weight == product.weight && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, weight);
    }

    @Override
    public String toString() {
        return "Продукт: " +
                name +
                ", цена: " + price +
                ". Количество: " + weight +
                " кг.";
    }


}
