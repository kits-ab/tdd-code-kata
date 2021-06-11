import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTest {

    @Test
    public void find() {
        int result = Binary.find(12, 1,2,3,4,12);

        assertEquals(4, result);
    }

    @Test
    public void find2Test() {
        int result = Binary.find2(12, 1,2,3,4,12);

        assertEquals(4, result);
    }

    private int find2(int a, int ... b) {
        int result = Binary.find2(a, b);
        return result< 0 ? -1 : result;
    }
    @Test
    public void find2es() {
        assertEquals(-1, find2(3));
        //assertEquals(-1, find2(3, 1));
        assertEquals(0, find2(1, 1, 3));

        assertEquals(0, find2(1, 1, 3, 5));
        assertEquals(1, find2(3, 1, 3, 5));
        assertEquals(2, find2(5, 1, 3, 5));
        assertEquals(-1, find2(0, 1, 3, 5));
        assertEquals(-1, find2(2, 1, 3, 5));
        assertEquals(-1, find2(4, 1, 3, 5));
        assertEquals(-1, find2(6, 1, 3, 5));

        assertEquals(0, find2(1, 1, 3, 5, 7));
        assertEquals(1, find2(3, 1, 3, 5, 7));
        assertEquals(2, find2(5, 1, 3, 5, 7));
        assertEquals(3, find2(7, 1, 3, 5, 7));
        assertEquals(-1, find2(0, 1, 3, 5, 7));
        assertEquals(-1, find2(2, 1, 3, 5, 7));
        assertEquals(-1, find2(4, 1, 3, 5, 7));
        assertEquals(-1, find2(6, 1, 3, 5, 7));
        assertEquals(-1, find2(8, 1, 3, 5, 7));
    }

}