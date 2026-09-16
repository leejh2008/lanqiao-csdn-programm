package Game;

import javax.swing.*;
import java.awt.*;

/**
 * @author jinhong
 * @date 2026/8/13 15:22
 * @description
 */

public class GamePanel extends JPanel {
    public int X0 = 50, Y0 = 50, LINE = 15, SIZE = 50;
    public GameListener gamelistener;
    public Chess[] chessList;
    public ImageIcon image = new ImageIcon("C:\\Users\\lrlh8\\OneDrive\\图片\\Screenshots\\屏幕截图 2026-08-26 170714.png");

    //public boolean start=false;
    //棋盘重绘
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image.getImage(), 0, 0, 900, 850, null);
        for (int i = 0; i < LINE; i++) {
            g.drawLine(X0, Y0 + SIZE * i, X0 + (LINE - 1) * SIZE, Y0 + SIZE * i);
            g.drawLine(X0 + SIZE * i, Y0, X0 + SIZE * i, Y0 + (LINE - 1) * SIZE);

        }

        //棋子重绘
        Chess chess = null;

        for (int i = 0; i < gamelistener.count; i++) {


            chess = chessList[i];

            chess.drawChess(g);


        }

        if (!gamelistener.start) {

            g.setColor(Color.RED);
            g.setFont(new Font("楷体", Font.BOLD, 70));
            if (gamelistener.gameState == 2) {
                g.drawString("黑棋认输，白棋胜利！", 60, 400);
            } else if (gamelistener.gameState == 1) {
                g.drawString("白棋认输，黑棋胜利！", 60, 400);
            } else {

                if (chess != null) {
                    Chess last=gamelistener.chessList[gamelistener.count-1];//访问数据源，直接拿取原始数据，拿到最后的棋子
                    if (last.color == Color.WHITE) {
                        g.drawString("白棋赢！", 300, 400);
                    } else if (chess.color == Color.BLACK) {
                        g.drawString("黑棋赢！", 300, 400);

                    }
                }

            }
        }

    }

}