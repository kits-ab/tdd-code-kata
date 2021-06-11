import java.util.ArrayList;
import java.util.List;

public class BridgeBlandning {

    public static List<String> createDeck() {
        String[] suits = {"♠️","♥️","♦️","♣️"};
        String[] values = {"A","K","Q","J","10","9","8","7","6","5","4","3","2"};

        List<String> deck = new ArrayList<>();

        for (String suit : suits) {
            for (String value : values) {
                deck.add(suit+value);
            }
        }
        return deck;
    }

    public static List<List<String>> deal() {
        List<String> deck = createDeck();
        List<List<String>> hands = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            List<String> hand = new ArrayList<>();
            hands.add(hand);
            for (int j = 0; j < 13; j++) {
                int index = (int) (Math.random() * deck.size());
                String card = deck.get(index);
                deck.remove(index);
                hand.add(card);
            }
        }
        return hands;
    }

    public static List<List<String>> sortHands(List<List<String>> hands) {
        List<String> deck = createDeck();
        for (List<String> hand : hands) {
            hand.sort((o1, o2) -> deck.indexOf(o1) > deck.indexOf(o2) ? 1 : -1);
        }
        return hands;
    }
}
