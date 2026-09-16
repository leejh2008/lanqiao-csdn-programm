package DrawToolone;

import javax.swing.*;
import java.awt.*;

/**
 * @author jinhong
 * @date 2026/7/12 20:54
 * @description
 */
public class DrawUI {
    public void initUI() {
        JFrame jf = new JFrame();
        jf.setSize(800, 200);
        jf.setTitle("画图工具");
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(3);
        jf.setVisible(true);

        Graphics g = jf.getGraphics();

        DrawListener listener = new DrawListener();
        jf.addMouseListener(listener);

        listener.gr = g;
    }

        public static void main(String[]args){
            DrawUI ui=new DrawUI();
            ui.initUI();
        }
    }

