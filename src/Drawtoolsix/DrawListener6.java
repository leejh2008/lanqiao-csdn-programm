package Drawtoolsix;

import java.awt.*;
import java.awt.event.*;

/**
 * @author jinhong
 * @date 2026/7/12 20:53
 * @description
 */
public class DrawListener6 implements MouseListener, ActionListener, MouseMotionListener {
    public Graphics gr;//保存画笔对象
    public int x1, x2, x3, y1, y2, y3,x4,y4;
    public String name;
    public boolean flag = true;
    public int strokeSize=4;
    public Color color=Color.BLACK;
    //保存图形对象的数组，默认是null
    public Shapes[]shapeArr=new Shapes[1000];
    //设置数组初始下标为0
    public int index=0;

    public void actionPerformed(ActionEvent e) {
        //获取按钮的内容
        name = e.getActionCommand();
        System.out.println("点击按钮！name=" + name);
        if ("蓝色".equals(name)) {
            color = Color.BLUE;
        }
        if ("红色".equals(name)) {
            color = Color.RED;
        }
        if("粗线".equals(name)){
            strokeSize=9;
        }
        if("细线".equals(name)){
            strokeSize=2;
        }
        if("橡皮擦".equals(name)){
        }
        flag = true;
        Graphics2D g2=(Graphics2D)gr;
        g2.setStroke(new BasicStroke(strokeSize));
    }

    public void mouseClicked(MouseEvent e) {
        x3=e.getX();
        y3=e.getY();
        if ("三角形".equals(name)) {
            Shapes shape=new Shapes(color,strokeSize,name,x1,y1,x2,y2,x3,y3);
            shapeArr[index]=shape;
            index++;

            gr.drawLine(x1, y1, x3, y3);
            gr.drawLine(x2, y2, x3, y3);
            flag = true;
        }

        if("多边形".equals(name)){

                Shapes shape = new Shapes(color, strokeSize ,name, x2, y2, x3, y3);
                shapeArr[index] = shape;
                index++;
                gr.drawLine(x2, y2, x3, y3);
                x2 = x3;
                y2 = y3;

           if( e.getClickCount()==2) {
               Shapes close =new Shapes(color, strokeSize, name, x1, y1, x3, y3);
               shapeArr[index] =close;
               index++;
               gr.drawLine(x1, y1, x3, y3);
               flag = true;


           }



        }


    }

    public void mousePressed(MouseEvent e) {
        System.out.println("按下");
        if (flag == true) {
            x1 = e.getX();
            y1 = e.getY();
        }
        if ("曲线".equals(name)){
            x4=e.getX();
            y4=e.getY();
        }
        if("橡皮擦".equals(name)){
            x4=e.getX();
            y4=e.getY();
            Graphics2D g2=(Graphics2D)gr;
            g2.setStroke(new BasicStroke(15));
            gr.setColor(Color.WHITE);


            x1=x4;
            y1=y4;
        }

    }
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
        if (flag==true) {
            x2 = e.getX();
            y2 = e.getY();
            System.out.println("x2=" + x2 + "   y2=" + y2);
        }



        gr.setColor(color);
        int w = Math.abs(x2 - x1);
        int h = Math.abs(y2 - y1);
        int X1 = Math.min(x1, x2);
        int Y1 = Math.min(y1, y2);

        if("直线".equals(name)){
            Shapes shape=new Shapes(color,strokeSize,name,x1,y1,x2,y2);

            //按顺序把图形对象保存到数组中
            shapeArr[index]=shape;
            index++;
        }
        if("矩形".equals(name)){
            Shapes shape=new Shapes(color,strokeSize,name,x1,y1,x2,y2);
            shapeArr[index]=shape;
            index++;
        }


        if("等腰三角形".equals(name)){
         int RX = 2 * x1 - x2;
            Shapes shape=new Shapes(color,strokeSize,name,x1,y1,x2,y2,RX);
            gr.drawLine(x1, y1, x2, y2);
            gr.drawLine(x1, y1, RX, y2);
            gr.drawLine(x2, y2, RX, y2);
            shapeArr[index]=shape;
            index++;
        }
        if ("椭圆".equals(name)) {
            int o = Math.abs(x2 - x1);
            int p = Math.abs(y2 - y1);
            int Z1 = Math.min(x1, x2);
            int Q1 = Math.min(y1, y2);
            gr.drawOval(Z1, Q1, o, p);
            Shapes shape=new Shapes(color,strokeSize,name,x1,y1,x2,y2);
            shapeArr[index]=shape;
            index++;

        }
        if ("三角形".equals(name)) {
            gr.drawLine(x1, y1, x2, y2);
            flag = false;


        }
       if("多边形".equals(name)&& flag==true){
           Shapes shape=new Shapes(color,strokeSize,name,x1,y1,x2,y2);
           shapeArr[index]=shape;
           index++;
           gr.drawLine(x1, y1, x2, y2);
           flag = false;
       }


    }
    public void mouseDragged(MouseEvent e){
        if("多边形".equals(name)){
            return;
        }
        //展示直线的拖拽效果
        if ("直线".equals(name)) {
            gr.setColor(Color.WHITE);
            gr.drawLine(x1, y1, x4,y4);
            x4=e.getX();
            y4=e.getY();
            gr.setColor(color);
            gr.drawLine(x1,y1,x4,y4);
        }
        int w = Math.abs(x2 - x1);
        int h = Math.abs(y2 - y1);
        int X1 = Math.min(x1, x2);
        int Y1 = Math.min(y1, y2);

        if ("矩形".equals(name)) {
            gr.setColor(Color.WHITE);
            gr.drawRect(X1, Y1, w, h);
            x2=e.getX();
            y2=e.getY();
            w = Math.abs(x2 - x1);
            h = Math.abs(y2 - y1);
            X1 = Math.min(x1, x2);
            Y1 = Math.min(y1, y2);
            gr.setColor(color);
            gr.drawRect(X1, Y1, w, h);
        }
        if("曲线".equals(name)){

            x4=e.getX();
            y4=e.getY();
            Shapes shape=new Shapes(color,strokeSize,name,x1,y1,x4,y4);
            shapeArr[index]=shape;
            index++;
            gr.drawLine(x1,y1,x4,y4);
            x1=x4;
            y1=y4;
        }
        if("橡皮擦".equals(name)){
            x4=e.getX();
            y4=e.getY();
            Shapes shape=new Shapes(color.WHITE,15,"曲线",x1,y1,x4,y4);
            shapeArr[index]=shape;
            index++;
            gr.drawLine(x1,y1,x4,y4);
            x1=x4;
            y1=y4;
        }

    }
    public void mouseMoved(MouseEvent e){

    }


    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {

    }}