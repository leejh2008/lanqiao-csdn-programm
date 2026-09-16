package DrawTooltwo;

import javax.swing.*;
import java.awt.*;

/**
 * @author jinhong
 * @date 2026/7/12 20:54
 * @description
 */
public class DrawUI2 {
    public void initUI() {
        JFrame jf = new JFrame();
        jf.setSize(800, 800);
        jf.setTitle("画图工具");
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(3);
        //流式布局管理器
        FlowLayout flow=new FlowLayout();
        jf.setLayout(flow);

        //功能按钮
        JButton jbu=new JButton("直线");
        jf.add(jbu);
        JButton jbu2=new JButton("矩形");
        jf.add(jbu2);
        JButton jbu3=new JButton("等腰三角形");
        jf.add(jbu3);
        JButton jbu4=new JButton("椭圆");
        jf.add(jbu4);
        JButton jbu5=new JButton("三角形");
        jf.add(jbu5);
        JButton blue=new JButton("蓝色");
        jf.add(blue);
        JButton red=new JButton("红色");
        jf.add(red);

        jf.setVisible(true);

        Graphics g = jf.getGraphics();

        DrawListener2 listener = new DrawListener2();
        jf.addMouseListener(listener);
        jbu.addActionListener(listener);
        jbu2.addActionListener(listener);
        jbu3.addActionListener(listener);
        jbu4.addActionListener(listener);
        jbu5.addActionListener(listener);
        blue.addActionListener(listener);
        red.addActionListener(listener);



        listener.gr = g;
    }

        public static void main(String[]args){
            DrawUI2 ui=new DrawUI2();
            ui.initUI();
        }
    }

