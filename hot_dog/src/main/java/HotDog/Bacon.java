package HotDog;

public class Bacon extends HotdogDecorator {
    Hotdog hotdog;

    public Bacon(Hotdog hotdog) {
        this.hotdog = hotdog;
    }

    public String getMenu() {
        return hotdog.getMenu() + ", Bacon!";
    }

    public float getPreco() {
        return 2.00f + hotdog.getPreco();
    }
}
