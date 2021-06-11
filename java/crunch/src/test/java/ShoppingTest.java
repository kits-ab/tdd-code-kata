import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingTest {

    @Test
    public void commonItems() {
        String [] shoppingLista1 = { "milk", "honey", "water"};
        String [] shoppingLista2 = { "silk", "milk", "ilk"};
        String [][] shoppingLists = { shoppingLista1, shoppingLista2};

        String[] result = Shopping.commonItems(shoppingLists);

        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals("milk", result[0]);
    }
}