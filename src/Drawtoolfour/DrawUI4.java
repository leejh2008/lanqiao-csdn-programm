package Drawtoolfour;

import Drawtoolthree.DrawListener3;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
/**
 * @author jinhong
 * @date 2026/7/12 20:54
 * @description
 */
public class DrawUI4 {
    public void initUI() {
        JFrame jf = new JFrame();
        jf.setSize(800, 800);
        jf.setTitle("画图工具");
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(3);
        jf.getContentPane().setBackground(Color.WHITE);

        //流式布局管理器
       // FlowLayout flow=new FlowLayout();
        //jf.setLayout(flow);

        //设置边界布局管理器
        jf.setLayout(new BorderLayout());
        JPanel northPanel=new JPanel();
        northPanel.setBackground(Color.BLACK);


        //功能按钮
        //把jf.改成northPanel.
        JButton jbu=new JButton("直线");
        northPanel.add(jbu);
        JButton jbu2=new JButton("矩形");
        northPanel.add(jbu2);
        JButton jbu3=new JButton("等腰三角形");
        northPanel.add(jbu3);
        JButton jbu4=new JButton("椭圆");
        northPanel.add(jbu4);
        JButton jbu5=new JButton("三角形");
        northPanel.add(jbu5);
        JButton jbu6=new JButton("多边形");
        northPanel.add(jbu6);
        JButton jbu7=new JButton("曲线");
        northPanel.add(jbu7);
        JButton jbu8=new JButton("橡皮擦");
        northPanel.add(jbu8);
        JButton jbu9=new JButton("粗线");
        northPanel.add(jbu9);
        JButton jbu10=new JButton("细线");
        northPanel.add(jbu10);
        JButton blue=new JButton("蓝色");
        northPanel.add(blue);
        JButton red=new JButton("红色");
        northPanel.add(red);
        JPanel drawPanel=new JPanel();
        drawPanel.setBackground(Color.WHITE);
        jf.add(northPanel,BorderLayout.NORTH);
        jf.add(drawPanel,BorderLayout.CENTER);


        jf.setVisible(true);

        Graphics g = jf.getGraphics();

        DrawListener4 listener = new DrawListener4();
        jf.addMouseListener(listener);
        jf.addMouseMotionListener(listener);
        jbu.addActionListener(listener);
        jbu2.addActionListener(listener);
        jbu3.addActionListener(listener);
        jbu4.addActionListener(listener);
        jbu5.addActionListener(listener);
        jbu6.addActionListener(listener);
        jbu7.addActionListener(listener);
        jbu8.addActionListener(listener);
        jbu9.addActionListener(listener);
        jbu10.addActionListener(listener);
        blue.addActionListener(listener);
        red.addActionListener(listener);



        listener.gr = g;
    }

        public static void main(String[]args){
            DrawUI4 ui=new DrawUI4();
            ui.initUI();
        }
    }

