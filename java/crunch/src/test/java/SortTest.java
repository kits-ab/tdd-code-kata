import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void test1() {
        //const input = [2, 1, 2, 1, 2]
        //const expected = [2, 2, 2, 1, 1]

        List<Double> inputList = new ArrayList<>();
        inputList.add(2D);
        inputList.add(1D);
        inputList.add(2D);
        inputList.add(1D);
        inputList.add(2D);

        List<Double> result = Sort.frequencySort(inputList);

        result.forEach(n -> System.out.print(n + ", "));
        System.out.println();
    }
    @Test
    public void test2() {
        //const input = [2, 1, 2, 1, 2]
        //const expected = [2, 2, 2, 1, 1]
        //const input = [1, 3, 3, 3, 2, 2, 1, 1]
        //const expected = [1, 1, 1, 3, 3, 3, 2, 2, 2]

        List<Double> inputList = new ArrayList<>();
        inputList.add(1D);
        inputList.add(3D);
        inputList.add(3D);
        inputList.add(3D);
        inputList.add(2D);
        inputList.add(2D);
        inputList.add(1D);
        inputList.add(1D);
        inputList.add(2D);

        List<Double> result = Sort.frequencySort(inputList);

        result.forEach(n -> System.out.print(n + ", "));
        System.out.println();
    }
    @Test
    public void test3() {
        //const input = [2, 1, 2, 1, 2]
        //const expected = [2, 2, 2, 1, 1]
        //const input = [1, 3, 3, 3, 2, 2, 1, 1]
        //const expected = [1, 1, 1, 3, 3, 3, 2, 2, 2]
        //const input = [11, 33, 11, 77, 54, 11, 25, 25, 33]
        //const expected = [11, 11, 11, 33, 33, 25, 25, 77, 54]

        List<Double> inputList = new ArrayList<>();
        inputList.add(11D);
        inputList.add(33D);
        inputList.add(11D);
        inputList.add(77D);
        inputList.add(54D);
        inputList.add(11D);
        inputList.add(25D);
        inputList.add(25D);
        inputList.add(33D);

        List<Double> result = Sort.frequencySort(inputList);

        result.forEach(n -> System.out.print(n + ", "));
        System.out.println();
    }
}