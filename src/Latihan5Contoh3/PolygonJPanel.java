package Latihan5Contoh3;

import javax.swing.*;
import java.awt.*;

public class PolygonJPanel extends JPanel {
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.setColor(new Color(255, 192, 203));
        g.drawLine(10, 100, 140, 90);
        g.drawLine(10, 100, 100, 160);
        g.drawLine(70, 290, 100, 160);
        g.drawLine(70, 290, 180, 220);
        g.drawLine(280, 290, 180, 220);
        g.drawLine(280, 290, 260, 160);
        g.drawLine(380, 100, 260, 160);
        g.drawLine(380, 100, 240, 90);
        g.drawLine(180, 10, 240, 90);
        g.drawLine(180, 10, 140, 90);

    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PolygonJPanel polygonJPanel = new PolygonJPanel();
        frame.add(polygonJPanel);
        frame.setSize(700, 370);
        frame.setVisible(true);
    }

}
