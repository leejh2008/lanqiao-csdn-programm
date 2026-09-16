package Ramdon;

import javax.swing.*;
import java.awt.*;

/**
 * @author jinhong
 * @date 2026/7/12 20:54
 * @description
 */
public class DrawUI8 {
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
        BorderLayout border = new BorderLayout();
        jf.setLayout(border);

        //面板组件
        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.PINK);
        Dimension dm = new Dimension(0, 60);
        northPanel.setPreferredSize(dm);
        jf.add(northPanel, BorderLayout.NORTH);
        JPanel drawPanel = new JPanel();
        drawPanel.setBackground(Color.WHITE);
        jf.add(drawPanel, BorderLayout.CENTER);
        DrawListener8 listener = new DrawListener8(drawPanel);

        //功能按钮
        //把jf.改成northPanel.
        //用数组简化原有设置

        JButton jbu = new JButton("图案");
        northPanel.add(jbu);
        jbu.addActionListener(listener);
        jf.setVisible(true);

    }



        public static void main(String[]args){
            DrawUI8 ui=new DrawUI8();
            ui.initUI();
        }
    }

