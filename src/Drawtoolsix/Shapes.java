package Drawtoolsix;

import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * @author jinhong
 * @date 2026/8/7 22:01
 * @description
 */
//根据图形对象设计对应的封装类Shapes
public class Shapes {
    public int x1, y1, x2, y2, x3, y3, RX;
    public String name;
    public Graphics g;
    public boolean flag = true;
    public Color color;
    public int strokeSize;


    public Shapes(Color color, int strokeSize, String name, int x1, int y1, int x2, int y2, int x3, int y3) {
        this.color = color;
        this.strokeSize = strokeSize;
        this.name = name;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public Shapes(Color color, int strokeSize, String name, int x1, int y1, int x2, int y2) {

        this.color = color;
        this.strokeSize = strokeSize;
        this.name = name;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

    }

    public Shapes(Color color, int strokeSize, String name, int x1, int y1, int x2, int y2, int RX) {

        this.color = color;
        this.strokeSize = strokeSize;
        this.name = name;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.RX = RX;

    }


    //方法：根据保存的数据还原图形效果
    public void drawShape(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        //还原画笔颜色
        g2.setColor(color);
        //还原画笔粗细
        g2.setStroke(new BasicStroke(strokeSize));
        switch (name) {
            case "直线":
                g.drawLine(x1, y1, x2, y2);
                break;
            case "矩形":
                int w = Math.abs(x2 - x1);
                int h = Math.abs(y2 - y1);
                int X1 = Math.min(x1, x2);
                int Y1 = Math.min(y1, y2);

                g.drawRect(X1, Y1, w, h);
                break;
            case "等腰三角形":
                int RX = 2 * x1 - x2;
                g.drawLine(x1, y1, x2, y2);
                g.drawLine(x1, y1, RX, y2);
                g.drawLine(x2, y2, RX, y2);
                break;
            case "椭圆":
                int o = Math.abs(x2 - x1);
                int p = Math.abs(y2 - y1);
                int Z1 = Math.min(x1, x2);
                int Q1 = Math.min(y1, y2);

                g.drawOval(Z1, Q1, o, p);
                break;


            case "三角形":

                g.drawLine(x1, y1, x3, y3);
                g.drawLine(x2, y2, x3, y3);
                g.drawLine(x1, y1, x2, y2);

                break;
            case "多边形":


                g.drawLine(x1, y1, x2, y2);
                break;

            case "曲线":
                g.setColor(this.color);
                ((Graphics2D) g).setStroke(new BasicStroke(this.strokeSize));
                g.drawLine(x1, y1, x2, y2);
                break;

        }
    }


}
