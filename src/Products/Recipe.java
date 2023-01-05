package Products;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private String nameRecipe;
    private Set<Product> listProduct= new HashSet<>();
    private double allProductPrice;

    public Recipe(String nameRecipe, Set<Product> listProduct ) {
        if (nameRecipe.isEmpty()|| nameRecipe==null){
            System.out.println("ВВЕДИТЕ НАЗВАНИЕ РЕЦЕПТА!");}
       else{ this.nameRecipe = nameRecipe;}
       this.listProduct=listProduct;

    }
    public static double calculatePriceProduct(Set<Product> listProduct){
        double allProductPrice = 0;
        for (Product i : listProduct)  {
            allProductPrice+=i.getPrice();
        }
        return allProductPrice;
    }
    

    public String getNameRecipe() {
        return nameRecipe;
    }

    public Set<Product> getProducts() {
        return listProduct;
    }


    @Override
    public String toString() {
        return "Название салата " +
                nameRecipe +". "+listProduct;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(nameRecipe, recipe.nameRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRecipe);
    }
}
