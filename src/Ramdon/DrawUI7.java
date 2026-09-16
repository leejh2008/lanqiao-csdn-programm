package Ramdon;

import Drawtoolfive.DrawListener5;

import javax.swing.*;
import java.awt.*;

/**
 * @author jinhong
 * @date 2026/7/12 20:54
 * @description
 */
public class DrawUI7 {
    public void initUI() {
        JFrame jf = new JFrame();
        jf.setSize(800, 800);
        jf.setTitle("画图工具");
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(3);
        jf.getContentPane().setBackground(Color.WHITE);



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
        DrawListener7 listener = new DrawListener7(drawPanel);

        //功能按钮
        //把jf.改成northPanel.
        //用数组简化原有设置
        String[]arr={"环","螺","树","三角","分形"};
        for (int i=0;i<arr.length;i++){
            JButton jbu=new JButton(arr[i]);
            northPanel.add(jbu);
            jbu.addActionListener(listener);
        }

        //
        drawPanel.setBackground(Color.WHITE);
        jf.add(drawPanel,BorderLayout.CENTER);


        jf.setVisible(true);

        Graphics g = drawPanel.getGraphics();
        drawPanel.addMouseListener(listener);





    }



        public static void main(String[]args){
            DrawUI7 ui=new DrawUI7();
            ui.initUI();
        }
    }

