import com.sun.javafx.sg.prism.NGShape;

import javax.swing.*;
import java.awt.*;

public class graphFrame extends JFrame {
    public graphFrame(double[] data){
        super("Dft function");
        setContentPane(new DrawPane(data));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800,600);
        setVisible(true);
    }
    class DrawPane extends JPanel {
        double[] graph;
        public DrawPane(double[] data) {
            super();
            graph=data;
        }
        public void paintComponent(Graphics g) {
            double max = 0;
            float onewidth = (int)((double)800/(double)graph.length*2);
            float spacing = (int)((double)800/(double)graph.length*2)*0.15f;
            for(int i=0;i<graph.length/2;i++){
                if(graph[i] > max)max=graph[i];
            }
            g.setColor(Color.black);
            g.fillRect(0, 0, 800, 600);
            g.setColor(Color.red);
            for(int i=0;i<graph.length/2;i++){
                g.fillRect((int) (i * onewidth + spacing), (int) (540.0 * (1.0 - (graph[i] / max)))+30,
                (int) (onewidth * 0.7f), (int)(540.0*(graph[i]/max)));
            }
            System.out.println(graph.length);
        }
    }
}
