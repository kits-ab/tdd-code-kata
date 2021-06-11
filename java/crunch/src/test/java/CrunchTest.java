import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class CrunchTest {
    @Test
    public void footballTest() throws Exception {
        String result = Crunch.crunchFootball();

        System.out.println(result);
        assertEquals("IFK", result);
    }

    @Test
    public void weatherTest() throws IOException {
        String result = Crunch.crunchWeather();

        assertEquals("16", result);
    }
}