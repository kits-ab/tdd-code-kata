import java.util.HashMap;
import java.util.Map;

public class Data {

    public static final Graph.Edge[] GRAPH = {
            new Graph.Edge("a", "b", 7),
            new Graph.Edge("a", "c", 9),
            new Graph.Edge("a", "f", 14),
            new Graph.Edge("b", "c", 10),
            new Graph.Edge("b", "d", 15),
            new Graph.Edge("c", "d", 11),
            new Graph.Edge("c", "f", 2),
            new Graph.Edge("d", "e", 6),
            new Graph.Edge("e", "f", 9)
    };

    public static final Map<String, Gui.Node> nodes = new HashMap<>();

    static {
        nodes.put("a", new Gui.Node("a", 80, 80));
        nodes.put("b", new Gui.Node("b", 150, 250));
        nodes.put("c", new Gui.Node("c", 180, 170));
        nodes.put("d", new Gui.Node("d", 200, 270));
        nodes.put("e", new Gui.Node("e", 290, 200));
        nodes.put("f", new Gui.Node("f", 270, 80));
    }

}