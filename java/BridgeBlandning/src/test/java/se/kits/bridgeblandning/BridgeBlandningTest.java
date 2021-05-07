import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class BridgeBlandningTest {

    @Test
    public void createDeck() {
        List<String> result = BridgeBlandning.createDeck();

        result.forEach(System.out::println);
        assertEquals(52, result.size());
    }

    @Test
    public void deal() {
        List<List<String>> hands = BridgeBlandning.deal();

        for (int i = 0; i < 4; i++) {
            hands.get(i).forEach(System.out::print);
            System.out.println();
        }

        assertEquals(4, hands.size());
        hands.forEach(a -> assertEquals(13, a.size()));
    }

    @Test
    public void sortHands() {
        List<List<String>> hands = BridgeBlandning.sortHands(BridgeBlandning.deal());

        for (int i = 0; i < 4; i++) {
            hands.get(i).forEach(System.out::print);
            System.out.println();
        }

        assertEquals(4, hands.size());
        hands.forEach(a -> assertEquals(13, a.size()));
    }
}
