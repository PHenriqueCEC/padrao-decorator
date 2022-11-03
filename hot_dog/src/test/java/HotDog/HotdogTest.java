package HotDog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotdogTest {

    @Test
    void deveRetornarDescricaoHotdogSalsicha() {
        Hotdog hotdog = new Salsicha();
        assertEquals("HD de salsicha!", hotdog.getMenu());
    }

    @Test
    void deveRetornarMenuHotdogFrango() {
        Hotdog hotdog = new Frango();
        assertEquals("HD de frango!", hotdog.getMenu());
    }

    @Test
    void deveRetornarMenuHotdogSalsicha() {
        Hotdog hotdog = new Frango();
        assertEquals("HD de frango!", hotdog.getMenu());
    }

    @Test
    void deveRetornarMenuHDSalsichaCombacon() {
        Hotdog hotdog = new Bacon(new Salsicha());

        assertEquals("HD de salsicha!, Bacon!", hotdog.getMenu());
    }

    @Test
    void deveRetornarMenuHDSalsichaComCalabresa() {
        Hotdog hotdog = new Calabresa(new Salsicha());

        assertEquals("HD de salsicha!, Calabresa!", hotdog.getMenu());
    }

    @Test
    void deveRetornarMenuHDFrangoComCalabresa() {
        Hotdog hotdog = new Calabresa(new Frango());

        assertEquals("HD de frango!, Calabresa!", hotdog.getMenu());
    }

    @Test
    void deveRetornarMenuHDFrangoComBacon() {
        Hotdog hotdog = new Bacon(new Frango());

        assertEquals("HD de frango!, Bacon!", hotdog.getMenu());
    }

    @Test
    void deveRetornarDescricaoHDSalsichaComBaconCalabresa() {
        Hotdog hotdog = new Calabresa(new Bacon(new Salsicha()));

        assertEquals("HD de salsicha!, Bacon!, Calabresa!", hotdog.getMenu());
    }

    @Test
    void deveRetornarDescricaoHDSalsichaComCalabresaBacon() {
        Hotdog hotdog = new Bacon(new Calabresa(new Salsicha()));

        assertEquals("HD de salsicha!, Calabresa!, Bacon!", hotdog.getMenu());
    }

    @Test
    void deveRetornarDescricaoHDFrangoComBaconCalabresa() {
        Hotdog hotdog = new Calabresa(new Bacon(new Frango()));

        assertEquals("HD de frango!, Bacon!, Calabresa!", hotdog.getMenu());
    }

    @Test
    void deveRetornarDescricaoHDFrangoComCalabresaBacon() {
        Hotdog hotdog = new Bacon(new Calabresa(new Frango()));

        assertEquals("HD de frango!, Calabresa!, Bacon!", hotdog.getMenu());
    }

    @Test
    void deveRetornarPrecoHDSalsicha() {
        Hotdog hotdog = new Salsicha();

        assertEquals(10.00f, hotdog.getPreco());
    }

    @Test
    void deveRetornarPrecoHDFrango() {
        Hotdog hotdog = new Frango();

        assertEquals(12.00f, hotdog.getPreco());
    }

    @Test
    void deveRetornarPrecoHDSalsichaComBacon() {
        Hotdog hotdog = new Bacon(new Salsicha());

        assertEquals(12.00f, hotdog.getPreco());
    }

    @Test
    void deveRetornarPrecoHDSalsichaComCalabresa() {
        Hotdog hotdog = new Calabresa(new Salsicha());

        assertEquals(12.50f, hotdog.getPreco());
    }

    @Test
    void deveRetornarPrecoHDFrangoComCalabresa() {
        Hotdog hotdog = new Calabresa(new Frango());

        assertEquals(14.50f, hotdog.getPreco());
    }

    @Test
    void deveRetornarPrecoHDFrangoComBacon() {
        Hotdog hotdog = new Bacon(new Frango());

        assertEquals(14.00f, hotdog.getPreco());
    }

    @Test
    void deveRetornarPrecoHDSalsichaComBaconCalabresa() {
        Hotdog hotdog = new Calabresa(new Bacon(new Salsicha()));

        assertEquals(14.50f, hotdog.getPreco());
    }

    @Test
    void deveRetornarPrecoHDFrangoComBaconCalabresa() {
        Hotdog hotdog = new Calabresa(new Bacon(new Frango()));

        assertEquals(16.50f, hotdog.getPreco());
    }







}
