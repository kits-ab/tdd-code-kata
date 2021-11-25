
public class Dijkstra {

    public static void main(String[] args) {
        Graph g = new Graph(Data.GRAPH);
        g.dijkstra("a");
        g.printAllPaths();
        System.out.println("\nPath to e");
        g.printPath("e");
        System.out.println("\nPath to f");
        g.printPath("f");
    }
}

