package Ramdon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author jinhong
 * @date 2026/7/12 20:53
 * @description
 */
public class DrawListener8 implements ActionListener {
    JPanel panel;

    public DrawListener8(JPanel panel) {

        this.panel = panel;
    }

    public void actionPerformed(ActionEvent e) {


        Graphics g = panel.getGraphics();
        double a = -2, b = -2, c =-1.2, d = 2;
        double x = 0, y = 0;
        for (int i = 0; i < 1000000; i++) {
            double nextX = Math.sin(a * y) - Math.cos(b * x);
            double nextY = Math.sin(c * x) - Math.cos(d * y);
            int drawX = (int) (nextX * 150 + 400);
            int drawY = (int) (-nextY *150 + 300);
            g.drawLine(drawX, drawY, drawX, drawY);
            x = nextX;
            y = nextY;
        }
    }


}



