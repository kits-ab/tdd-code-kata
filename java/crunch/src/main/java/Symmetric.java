import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Symmetric {


    public static List<String> orderNames(List<String> names) {
        List<String> names2 = names.stream().filter(a -> names.indexOf(a)%2 == 1).toList();
        List<String> names4 = names.stream().filter(a -> names.indexOf(a)%2 != 1).collect(Collectors.toList());

        List<String> names3 = new ArrayList<>();

        for (int i = names2.size()-1; i >= 0 ; i--) {
            names3.add(names2.get(i));
        }

        names4.addAll(names3);
        return names4;
    }

}
