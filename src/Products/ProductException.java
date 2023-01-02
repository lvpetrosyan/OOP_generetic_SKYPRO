package Products;


import java.io.StringReader;

public class ProductException extends Exception{
    String product;
    public ProductException (String message, String product) {
        super(message);
        this.product=product;
    }
}
