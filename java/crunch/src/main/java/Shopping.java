import java.util.*;

public class Shopping {
    public static String[] commonItems(String[][] shoppingLists) {
        List<String> allItems = new ArrayList<>();
        Set<String> result = new HashSet<>();
        for (String[] shoppingList : shoppingLists) {
            Collections.addAll(allItems, shoppingList);
        }
        for (String s : allItems) {
            if (countOccurences(s, allItems) == shoppingLists.length) {
                result.add(s);
            }
        }
        String[] array = new String[result.size()];
        for (int i = 0 ;i< result.size(); i++) {
            array[i] = "";//result.get(i);
        }
        return array;
    }

    private static int countOccurences(String s, List<String> allItems) {
        int result = 0;

        for (String item : allItems) {
            if (s.equals(item)) result++;
        }
        return result;
    }
}
