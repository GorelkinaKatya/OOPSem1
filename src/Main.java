import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /*
        1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
        2)Создать класс Категория, имеющий переменные имя и массив товаров.
          Создать несколько объектов класса Категория.
        3)Создать класс Basket, содержащий массив купленных товаров.
        4)Создать класс User, содержащий логин, пароль и объект класса Basket.
          Создать несколько объектов класса User.
        5)Вывести на консоль каталог продуктов. (все продукты магазина)
        6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя
          добавляется товар, а из магазина - удаляется)*/

        Category vegetables = new Category("Vegetables", new ArrayList<>());
        vegetables.add(new Product("Potato", 12, 5));
        vegetables.add(new Product("Tomato", 350, 4));
        vegetables.add(new Product("Cucumber", 240, 4));

        Category fruits = new Category("Fruits", new ArrayList<>());
        fruits.add(new Product("Watermelon",25,5));
        fruits.add(new Product("Melon",200,5));

        Set<Category> catalog = new HashSet<>();
        catalog.add(vegetables);
        catalog.add(fruits);

        System.out.println("Каталог продуктов: " + catalog);

        User polina = new User("Polina","polya95", new Basket(new ArrayList<>()));
        polina.getBasket().add(vegetables.getProductArray().get(0));
        vegetables.getProductArray().remove(0);

        User anton = new User("Anton","anton-champion",new Basket(new ArrayList<>()));
        anton.getBasket().add(fruits.getProductArray().get(1));
        fruits.getProductArray().remove(1);
        anton.getBasket().add(vegetables.getProductArray().get(0));
        vegetables.getProductArray().remove(0);

        System.out.println("Polina" + polina);
        System.out.println("Anton" + anton);

        System.out.println("Каталог продуктов (после покупок): " + catalog);

    }
}