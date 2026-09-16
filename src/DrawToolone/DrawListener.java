package DrawToolone;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author jinhong
 * @date 2026/7/12 20:53
 * @description
 */
public class  DrawListener implements MouseListener,ActionListener {
    public Graphics gr;
    public int x1, x2, y1, y2;
    public String name = "直线";

    public void actionPerformed(ActionEvent e) {
        //获取按钮的内容
        name = e.getActionCommand();
        System.out.println("点击按钮！name=" + name);
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("点击");

    }

    public void mousePressed(MouseEvent e) {
        System.out.println("按下");
        x1 = e.getX();
        y1 = e.getY();
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
        x2 = e.getX();
        y2 = e.getY();
        if (gr != null) {
            int w = Math.abs(x2 - x1);
            int h = Math.abs(y2 - y1);
            int X1 = Math.min(x1, x2);
            int Y1 = Math.min(y1, y2);
            gr.drawRect(X1, Y1, w, h);
            gr.drawLine(x1, y1, x2, y2);
            gr.drawOval(X1, Y1, w, h);
            int RX = 2 * x1 - x2;
            gr.drawLine(x1, y1, x2, y2);
            gr.drawLine(x1, y1, RX, y2);
            gr.drawLine(x2, y2, RX, y2);
        }
    }


    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {

    }
}
