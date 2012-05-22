package org.kodejava.example.awt.geom;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

public class DrawArc extends JApplet {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.setStroke(new BasicStroke(2.0f));
        g2.setPaint(Color.RED);
        g2.draw(new Arc2D.Double(50, 50, 300, 300, 0, 90, Arc2D.PIE));
        g2.setPaint(Color.GREEN);
        g2.draw(new Arc2D.Double(50, 50, 300, 300, 90, 90, Arc2D.PIE));
        g2.setPaint(Color.BLUE);
        g2.fill(new Arc2D.Double(50, 50, 300, 300, 180, 90, Arc2D.PIE));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Arch Demo");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JApplet applet = new DrawArc();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setSize(new Dimension(400, 450));
        frame.setVisible(true);
    }
}
