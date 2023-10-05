public class User {
    private String login;
    private String pass;
    private Basket basket;

    public User(String login, String pass, Basket basket) {
        this.login = login;
        this.pass = pass;
        this.basket = basket;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "`s покупки: " + basket;
    }
}
