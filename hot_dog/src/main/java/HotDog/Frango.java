package HotDog;

public class Frango implements Hotdog {

    public String menu;

    public Frango() {
        menu = "HD de frango!";
    }

    public String getMenu() {
        return this.menu;
    }

    public float getPreco() {
        return 12.00f;
    }
}
