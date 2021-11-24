
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Gui extends JFrame {
    public static  Map<String, Node> nodes = new HashMap<>();
    static {
        nodes.put("a", new Node("a", 80,80));
        nodes.put("b", new Node("b", 150,250));
        nodes.put("c", new Node("c", 180,150));
        nodes.put("d", new Node("d", 200,270));
        nodes.put("e", new Node("e", 290,200));
        nodes.put("f", new Node("f", 220,120));
    }

    public Gui() {

        setSize(new Dimension(500, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JPanel p = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                for (Graph.Edge edge : Dijkstra.GRAPH) {
                    drawEdge(g, nodes.get(edge.v1), nodes.get(edge.v2));
                }
                for (Node value : nodes.values()) {
                    drawNode(g, value.name, value.x, value.y);
                }
                Shape rect = new Rectangle(3, 3, 303, 303);
                Shape roundRect = new RoundRectangle2D.Double(20, 20, 250, 250, 5, 25);
            }
        };
        setTitle("Graph");
        this.getContentPane().add(p);
    }

    private void drawNode(Graphics g, String name, int x, int y) {
        Shape circle = new Ellipse2D.Double(x - 8, y - 8, 16, 16);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(4f));
        g2.setColor(Color.GRAY);
        g2.draw(circle);
    }

    private void drawEdge(Graphics g, Node node1, Node node2) {
        Shape line = new Line2D.Double(node1.x, node1.y, node2.x, node2.y);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(10f));
        g2.draw(line);
    }

    public static void main(String[] arg) {

        SwingUtilities.invokeLater(Gui::new);
    }

    public static class Node {
        public final String name;
        public final int x, y;
        public Node(String name, int x, int y) {
            this.name = name;
            this.x = x;
            this.y = y;
        }
    }
}
