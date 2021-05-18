import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void binarySearches() {
        assertEquals(-1, binarySearch(3, Arrays.asList()));
        assertEquals(-1, binarySearch(3, Arrays.asList(1)));
        assertEquals(0, binarySearch(1, Arrays.asList(1, 3)));

        assertEquals(0, binarySearch(1, Arrays.asList(1, 3, 5)));
        assertEquals(1, binarySearch(3, Arrays.asList(1, 3, 5)));
        assertEquals(2, binarySearch(5, Arrays.asList(1, 3, 5)));
        assertEquals(-1, binarySearch(0, Arrays.asList(1, 3, 5)));
        assertEquals(-1, binarySearch(2, Arrays.asList(1, 3, 5)));
        assertEquals(-1, binarySearch(4, Arrays.asList(1, 3, 5)));
        assertEquals(-1, binarySearch(6, Arrays.asList(1, 3, 5)));

        assertEquals(0, binarySearch(1, Arrays.asList(1, 3, 5, 7)));
        assertEquals(1, binarySearch(3, Arrays.asList(1, 3, 5, 7)));
        assertEquals(2, binarySearch(5, Arrays.asList(1, 3, 5, 7)));
        assertEquals(3, binarySearch(7, Arrays.asList(1, 3, 5, 7)));
        assertEquals(-1, binarySearch(0, Arrays.asList(1, 3, 5, 7)));
        assertEquals(-1, binarySearch(2, Arrays.asList(1, 3, 5, 7)));
        assertEquals(-1, binarySearch(4, Arrays.asList(1, 3, 5, 7)));
        assertEquals(-1, binarySearch(6, Arrays.asList(1, 3, 5, 7)));
        assertEquals(-1, binarySearch(8, Arrays.asList(1, 3, 5, 7)));
    }

}
