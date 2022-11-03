package HotDog;

public class Calabresa extends HotdogDecorator {

    Hotdog hotdog;

    public Calabresa(Hotdog hotdog) {
        this.hotdog = hotdog;
    }

    public String getMenu() {
        return hotdog.getMenu() + ", Calabresa!";
    }

    public float getPreco() {
        return 2.50f + hotdog.getPreco();
    }
}
