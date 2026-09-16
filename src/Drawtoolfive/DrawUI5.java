package Drawtoolfive;

import Drawtoolfour.DrawListener4;

import javax.swing.*;
import java.awt.*;

/**
 * @author jinhong
 * @date 2026/7/12 20:54
 * @description
 */
public class DrawUI5 {
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
        BorderLayout border=new BorderLayout();
        jf.setLayout(border);

        //面板组件
        JPanel northPanel=new JPanel();
        northPanel.setBackground(Color.PINK);
        Dimension dm=new Dimension(0,60);
        northPanel.setPreferredSize(dm);
        jf.add(northPanel,BorderLayout.NORTH);
        DrawListener5 listener=new DrawListener5();

        //功能按钮
        //把jf.改成northPanel.
        //用数组简化原有设置
        String[]arr={"直线","矩形","等腰三角形","椭圆","三角形","多边形","曲线","橡皮擦","粗线","细线","蓝色","红色"};
        for (int i=0;i<arr.length;i++){
            JButton jbu=new JButton(arr[i]);
            northPanel.add(jbu);
            jbu.addActionListener(listener);
        }

        JPanel drawPanel=new JPanel();
        drawPanel.setBackground(Color.WHITE);
        jf.add(drawPanel,BorderLayout.CENTER);


        jf.setVisible(true);

        Graphics g = drawPanel.getGraphics();
        drawPanel.addMouseListener(listener);
        drawPanel.addMouseMotionListener(listener);




        listener.gr = g;
    }

        public static void main(String[]args){
            DrawUI5 ui=new DrawUI5();
            ui.initUI();
        }
    }

