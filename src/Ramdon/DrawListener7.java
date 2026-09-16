package Ramdon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

/**
 * @author jinhong
 * @date 2026/7/12 20:53
 * @description
 */
public class DrawListener7 implements ActionListener,MouseListener {
    public String name;
    public int x1, x2, x3, y1, y2, y3;
    public boolean flag = true;
    JPanel panel;

    public DrawListener7(JPanel panel) {
        this.panel = panel;
    }
    public void mousePressed(MouseEvent e) {
        System.out.println("按下");
        if (flag == true) {
            x1 = e.getX();
            y1 = e.getY();
            System.out.println("x1=" + x1 + "   y1=" + y1);
        }
    }
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
        if (flag==true) {
            x2 = e.getX();
            y2 = e.getY();
            System.out.println("x2=" + x2 + "   y2=" + y2);
        }
        if ("三角".equals(name)) {
            Graphics g= panel.getGraphics();
            g.drawLine(x1, y1, x2, y2);
            flag = false;

        }

    }

    public void mouseClicked(MouseEvent z) {

        x3 = z.getX();
        y3 = z.getY();
        if ("三角".equals(name)) {
            Graphics g= panel.getGraphics();
            g.drawLine(x1, y1, x3, y3);
            g.drawLine(x2, y2, x3, y3);
            flag = true;
        }}

        public void actionPerformed(ActionEvent s){
            name = s.getActionCommand();
            if ("环".equals(name)) {
                Graphics g= panel.getGraphics();

                double a = 1.4, b = 1.56, c = 1.4, d = 6.56;
                double x = 0, y = 0;
                for (int i = 0; i < 50000; i++) {
                    double nextX = d * Math.sin(a * x) - Math.sin(b * y);
                    double nextY = c * Math.cos(a * x) + Math.cos(b * y);
                    int drawX = (int) (nextX * 50 + 400);
                    int drawY = (int) (nextY * 50 + 300);
                    g.drawLine(drawX, drawY, drawX, drawY);
                    x = nextX;
                    y = nextY;
                }
            }
            if ("螺".equals(name)) {
                Graphics g= panel.getGraphics();
                double a = -2, b = -2, c = -1.2, d = 2;

                double x = 0, y = 0;
                for (int i = 0; i < 1000000; i++) {
                    double nextX = Math.sin(a * y) - Math.cos(b * x);
                    double nextY = Math.sin(c * x) - Math.cos(d * y);
                    int drawX = (int) (nextX * 150 + 400);
                    int drawY = (int) (-nextY * 150 + 300);
                    g.drawLine(drawX, drawY, drawX, drawY);
                    x = nextX;
                    y = nextY;
                }
            }
            if ("树".equals(name)) {
                Graphics g= panel.getGraphics();
                double[][] trans = {
                        {0.195, -0.488, 0.3440, 0.4430, 0.4431, 0.2452, 0.2},
                        {0.4620, 0.4140, -0.2520, 0.3610, 0.2511, 0.5692, 0.2},
                        {-0.6370, 0, 0, 0.5010, 0.8562, 0.2512, 0.2},
                        {-0.0350, 0.07, -0.4690, 0.0220, 0.4884, 0.5069, 0.2},
                        {-0.0580, -0.07, 0.453, -0.111, 0.5976, 0.0969, 0.2}
                };
                double x = 0, y = 0;
                for (int i = 0; i < 1000000; i++) {
                    int arr = (int) (Math.random() * 5);
                    double[] p = trans[arr];
                    double a = p[0];
                    double b = p[1];
                    double c = p[2];
                    double d = p[3];
                    double e = p[4];
                    double f = p[5];
                    double nextX = a * x + b * y + e;
                    double nextY = c * x + d * y + f;
                    int drawX = (int) (nextX * 600 + 150);
                    int drawY = (int) (-nextY * 600 + 700);
                    g.drawLine(drawX, drawY, drawX, drawY);
                    x = nextX;
                    y = nextY;

                }
            }
            //谢尔宾斯基三角
            //分形与三角分开，解决绘制冲突
            if("分形".equals(name)){
                Graphics g= panel.getGraphics();
                Random ran=new Random();
                int px=x1;
                int py=y1;
                for(int i=0;i<20000;i++){
                    int n= ran.nextInt(3);
                    if(n==0){
                        px=(x1+px)/2;
                        py=(y1+py)/2;
                    }
                    else if(n==1){
                        px=(x2+px)/2;
                        py=(y2+py)/2;
                    }
                    else if(n==2){
                        px=(x3+px)/2;
                        py=(y3+py)/2;
                    }
                    g.drawLine(px,py,px,py);
                }

            }


        }
    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {

    }

}



