import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BridgeBlandningTest {

    @Test
    public void createDeck() {
        List<String> result = BridgeBlandning.createDeck();

        System.out.println("Deck created:");
        result.forEach(System.out::print);
        System.out.println("\n----------");
        assertEquals(52, result.size());
    }

    @Test
    public void deal() {
        List<List<String>> hands = BridgeBlandning.deal();

        System.out.println("Dealt cards:");
        for (int i = 0; i < 4; i++) {
            hands.get(i).forEach(System.out::print);
            System.out.println();
        }

        System.out.println("----------");
        assertEquals(4, hands.size());
        hands.forEach(a -> assertEquals(13, a.size()));
    }

    @Test
    public void sortHands() {
        List<List<String>> hands = BridgeBlandning.sortHands(BridgeBlandning.deal());

        System.out.println("Sorted hands:");
        for (int i = 0; i < 4; i++) {
            hands.get(i).forEach(System.out::print);
            System.out.println();
        }

        System.out.println("----------");
        assertEquals(4, hands.size());
        hands.forEach(a -> assertEquals(13, a.size()));
    }

}