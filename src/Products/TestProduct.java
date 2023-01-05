package Products;


import AVTO.Car;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

import static Products.Product.buyProduct;

public class TestProduct {

    public static void main(String[] args) throws ProductException {
        Product banan = new Product("банан", 150.5, 2);
        Product smetanka = new Product("сметана", 80.99, 0.3);
        Product cake = new Product("пирожное", 522, 0.5);
        Product mayonez = new Product("майонез", 155, 1);
        Product tomato = new Product("помидор", 289, 1.3);
        Product cucumber = new Product("огуреу", 250, 1);
        Product olives = new Product("оливки", 300, 0.4);
        Product cheese = new Product("сыр", 522, 1);
        Set<Product> listProduct = new HashSet<>();
        addProductTest(banan, listProduct);
        addProductTest(smetanka, listProduct);
        addProductTest(mayonez, listProduct);
        addProductTest(tomato, listProduct);
        addProductTest(cucumber, listProduct);
        addProductTest(olives, listProduct);
        removeProduct(cheese, listProduct);
        buyProduct(banan);
        for (Product product : listProduct) {
            System.out.println(product);
        }
        System.out.println("Рецепты салатов");
        Set<Product> salat1Product = new HashSet<>();
        Recipe salat1 = new Recipe("Салат летний", salat1Product);
        addProductInRecept(tomato, salat1Product);
        addProductInRecept(cucumber, salat1Product);
        Set<Product> salat2Product = new HashSet<>();
        Recipe salat2 = new Recipe("Салат нний", salat2Product);
        addProductInRecept(olives, salat2Product);
        addProductInRecept(cheese, salat2Product);
        Set<Product> salat3Product = new HashSet<>();
        addProductInRecept(smetanka,salat3Product);
        Recipe salat3 = new Recipe("Салат весенний", salat3Product);
        Recipe salat4 = new Recipe("Салат весенний", salat2Product);

        addProductInRecept(olives, salat3Product);
        addProductInRecept(cheese, salat3Product);
        Set<Recipe> listRecipt = new HashSet<>();
        listRecipt.add(salat1);
        listRecipt.add(salat2);
        listRecipt.add(salat3);
        listRecipt.add(salat4);
        System.out.println(salat1);
        System.out.println("Общая цена продуктов на салат: " + Recipe.calculatePriceProduct((Set<Product>) salat1Product));
        System.out.println(salat2);
        System.out.println("Общая цена продуктов на салат: " + Recipe.calculatePriceProduct((Set<Product>) salat2Product));
        System.out.println(salat3);
        System.out.println("Общая цена продуктов на салат: " + Recipe.calculatePriceProduct((Set<Product>) salat3Product));

    }


    public static void addProductInRecept(Product product, Set<Product> listRecipt) throws ProductException {
        if (listRecipt.contains(product)) {
            throw new ProductException("Продукт уже есть в списке- ", product.getName());
        }
        if (!correctName(product)) {
            throw new ProductException("Введите корректное название! ", product.getName());
        } else {
            listRecipt.add(product);
        }
    }

    public static void addProductTest(Product product, Set<Product> listProduct) throws ProductException {
        if (listProduct.contains(product)) {
            throw new ProductException("Продукт уже есть в списке- ", product.getName());
        } else listProduct.add(product);
    }

    public static boolean correctName(Product product) {
        if (product == null) {
            return false;
        }
        return Pattern.matches("[а-яА-Я0-9]$", product.toString());
    }

    public static void removeProduct(Product product, Set<Product> listProduct) {
        listProduct.remove(product);
    }

}
