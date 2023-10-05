import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> productArray;

    public Basket(ArrayList<Product> productArray) {
        this.productArray = productArray;
    }

    public ArrayList<Product> getProductArray() {
        return productArray;
    }

    public void setProductArray(ArrayList<Product> productArray) {
        this.productArray = productArray;
    }

    public void add(Product product){
        productArray.add(product);
    }

    @Override
    public String toString() {
        return "" + productArray;
    }
}
