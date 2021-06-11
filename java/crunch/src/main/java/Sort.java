import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sort {

    public static List<Double> frequencySort(List<Double> numbers) {
        HashMap<Double, Freq> freqs = new HashMap<>();
        int index = 0;
        for (Double n : numbers) {
            addNumber(freqs, index++, n);
        }

        List<Freq> freqs1 = freqs.values().stream().sorted().toList();

        List<Double> result= new ArrayList<>();
        for (Freq freq : freqs1) {
            for (int i = 0; i < freq.count; i++) {
                result.add(freq.number);
            }
        }

        return result;

    }

    private static void addNumber(Map<Double, Freq> freqs, int i, Double n) {
        if (freqs.containsKey(n)) {
            freqs.put(n, new Freq(freqs.get(n).count + 1, freqs.get(n).index, n));
        }
        else {
            freqs.put(n, new Freq(1, i, n));
        }
    }

    static class Freq implements Comparable<Freq> {
        Integer count;
        Double number;
        Integer index;

        Freq(Integer count, int index, Double number) {
            this.count = count;
            this.index = index;
            this.number = number;
        }

        @Override
        public int compareTo(Freq o) {
            int i = -count.compareTo(o.count);
            if (i == 0) {
                i = index.compareTo(o.index);
            }
            return i;
        }
    }
}
