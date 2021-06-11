import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SymmetricTest {

// Bo
// Pat
// Jean
// Kevin
// Claude
// William
// Marybeth

    @Test
    public void testIt() {
        List<String> strings = Symmetric.orderNames(Collections.emptyList());

        assertEquals(Collections.emptyList(), strings);
    }

    @Test
    public void testIt2() {
        List<String> strings = Symmetric.orderNames(Collections.singletonList("Hej"));

        assertEquals("Hej", strings.get(0));
    }

    @Test
    public void testIt3() {

        List<String> input = new ArrayList<>();
        input.add("Bo");
        input.add("Bob");
        input.add("Andy");
        input.add("Cole");
        input.add("Candy");
        input.add("Porter");
        input.add("Beowulf");
        input.add("Marybeth");
        input.add("Chewbacca");

        List<String> strings = Symmetric.orderNames(input);

        assertEquals("Bo", strings.get(0));

        strings.forEach(a -> System.out.println(a));
    }

}