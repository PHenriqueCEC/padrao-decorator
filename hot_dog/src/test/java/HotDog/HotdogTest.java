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
    void deveRetornarDescricaoHotdogFrango() {
        Hotdog hotdog = new Frango();
        assertEquals("HD de frango!", hotdog.getMenu());
    }





}
