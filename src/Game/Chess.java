package Game;

import java.awt.*;

/**
 * @author jinhong
 * @date 2026/8/13 15:22
 * @description
 */
public class Chess {
    public String name;
    public int x, y;
    public Color color;
    public int X0 = 50, Y0 = 50, LINE = 15, SIZE = 50, CHESS = 50;
    //public static boolean isStart = false;

    public Chess(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;

    }

    public void drawChess(Graphics g) {
        for(int i=0;i<CHESS;i++){
            if(this.color==Color.BLACK) {
                g.setColor(new Color(i * 3, i * 3, i * 3));
            }else {
                g.setColor(new Color(255-i * 1, 252-i * 1, 244-i * 1));
            }
            g.fillOval(x * SIZE + X0 - CHESS / 2+i/2, y * SIZE + Y0 - CHESS / 2+i/2, CHESS-i, CHESS-i);
    }}
}


