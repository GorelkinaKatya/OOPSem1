import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Product> productArray;

    public Category(String name, ArrayList<Product> productArray) {
        this.name = name;
        this.productArray = productArray;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "Категория: " + name + productArray;
    }
}
