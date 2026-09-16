package Drawtoolthree;

import java.awt.*;
import java.awt.event.*;

/**
 * @author jinhong
 * @date 2026/7/12 20:53
 * @description
 */
public class DrawListener3 implements MouseListener, ActionListener {
    public Graphics gr;
    public int x1, x2, x3, y1, y2, y3;
    public String name;
    public Color selectColor = Color.BLUE;
    public boolean flag = true;

    public void actionPerformed(ActionEvent e) {
        //获取按钮的内容
        name = e.getActionCommand();
        System.out.println("点击按钮！name=" + name);
        if ("蓝色".equals(name)) {
            selectColor = Color.BLUE;
        }
        if ("红色".equals(name)) {
            selectColor = Color.RED;
        }
        flag = true;
    }

    public void mouseClicked(MouseEvent e) {

        x3 = e.getX();
        y3 = e.getY();
        if ("三角形".equals(name)) {
            gr.drawLine(x1, y1, x3, y3);
            gr.drawLine(x2, y2, x3, y3);
            flag = true;
            System.out.println("x3=" + x3 + "   y3=" + y3);
        }

    }







    public void mousePressed(MouseEvent e) {
        System.out.println("按下");
        if (flag==true) {
            x1 = e.getX();
            y1 = e.getY();
        }
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
        if (flag==true) {
            x2 = e.getX();
            y2 = e.getY();
            System.out.println("x2=" + x2 + "   y2=" + y2);
        }



        gr.setColor(selectColor);
        int w = Math.abs(x2 - x1);
        int h = Math.abs(y2 - y1);
        int X1 = Math.min(x1, x2);
        int Y1 = Math.min(y1, y2);
        if ("直线".equals(name)) {
            gr.drawLine(x1, y1, x2, y2);
        }
        if ("矩形".equals(name)) {
            gr.drawRect(X1, Y1, w, h);
        }

        if ("等腰三角形".equals(name)) {
            int RX = 2 * x1 - x2;
            gr.drawLine(x1, y1, x2, y2);
            gr.drawLine(x1, y1, RX, y2);
            gr.drawLine(x2, y2, RX, y2);
        }
        if ("椭圆".equals(name)) {
            gr.drawOval(X1, Y1, w, h);
        }
        if ("三角形".equals(name)) {
            gr.drawLine(x1, y1, x2, y2);
            flag = false;

        }
    }


    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {

    }
}



