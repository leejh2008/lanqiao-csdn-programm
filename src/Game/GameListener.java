package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author jinhong
 * @date 2026/8/12 21:27
 * @description
 */

public class GameListener extends MouseAdapter implements ActionListener {
    public Graphics gr;//画笔
    public int count = 0;//添加计数器
    public int X0 = 50, Y0 = 50, LINE = 15, SIZE = 50, CHESS = 50;//定义初始变量
    public int chessX, chessY;//行，列
    public Color color;
    public JFrame frame;//接收窗口
    public GamePanel panel;//接收棋盘面板
    public String name;
    public int[][] chessArr = new int[LINE][LINE];//定义二维数组保存棋子颜色
    public Chess[] chessList = new Chess[LINE*LINE];//保存棋子对象
    public int chessindex = 0;
    public boolean start = false;
    public int gameState=0;//0为正常对局，1为白认输，2为黑认输




    public void actionPerformed(ActionEvent e) {
        String name = e.getActionCommand();
        System.out.println("点击按钮！name=" + name);
        switch (name) {
            case "开始":
                start = true;
                count=0;
                for(int i=0;i<LINE;i++){
                    for(int j=0;j<LINE;j++){
                        chessArr[i][j]=0;
                    }
                }
                for(int i=0;i<chessList.length;i++){
                    chessList[i]=null;
                }
                panel.repaint();
                break;
            case "悔棋":
                //取出最后一个棋子
                count--;
                Chess c = chessList[count];
                //清空二维数组数据
                chessArr[c.y][c.x] = 0;
                chessList[count] = null;
                //repaint刷新棋盘
                panel.repaint();
                break;
            case "复盘":

                //按顺序备份所有棋子的数据
                if (count <= 0) {
                    return;
                }
                Chess[] copyArr = new Chess[count];
                for (int i = 0; i < count; i++) {
                    copyArr[i] = chessList[i];
                }
                //清空棋盘上的数据
                for (int i = 0; i < chessList.length; i++) {
                    chessList[i] = null;
                }
                count=0;
                //按顺序将棋子再画一遍
                panel.paint(gr);
                for (int i = 0; i < copyArr.length; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException a) {
                        throw new RuntimeException(a);
                    }
                    Chess h = copyArr[i];
                    h.drawChess(gr);
                }
                break;
            case"认输":
                if(!start){
                    return;
                }
                start=false;
                if(count%2==1){
                    gameState=2;
                    //2为黑认输
                    drawString();
                }else {
                    gameState=1;
                    //1为白认输
                    drawString();
                }
                panel.repaint();


                break;
        }

    }

    public void mouseClicked(MouseEvent e) {

        int x = e.getX();
        int y = e.getY();
        System.out.println("点击");
        //计算棋子的交点值
        if ((x - X0) % SIZE > SIZE / 2) {
            chessX = (x - X0) / SIZE + 1;
        } else {
            chessX = (x - X0) / SIZE;
        }
        if ((y - Y0) % SIZE > SIZE / 2) {
            chessY = (y - Y0) / SIZE + 1;
        } else {
            chessY = (y - Y0) / SIZE;
        }
        //重要，判断是否开始，若没有开始则返回
        if (!start) {
            return;
        }
        System.out.println("chessX=" + chessX + "chessY=" + chessY);
        //边界检验，防止数组越界 新增
        if (chessX < 0 || chessX >= LINE || chessY < 0 || chessY >= LINE) {
            return;
        }
        //判断该位置是否有棋子，不得重复落子
        if (chessArr[chessY][chessX] != 0) {
            System.out.println("该位置已经落子");
            return;
        }
        if (count % 2 == 1) {
            color=Color.BLACK;

            //将落子坐标点存入二维数组，黑色为1，白色为2
            chessArr[chessY][chessX]=1;

        } else {
            color=Color.WHITE;

            chessArr[chessY][chessX] = 2;

        }
        //画棋子
        Chess chess=new Chess(color,chessX,chessY);
        chess.drawChess(gr);
        chessList[count]=chess;
        count++;
       // gr.fillOval(rX - CHESS / 2, rY - CHESS / 2, CHESS, CHESS);


        chessindex++;


        //判断输赢
        if (isWin() >= 5) {

            start=false;
            panel.repaint();

        }


    }
    public void drawString(){

    }


    public int isWin() {

        int c = 0;//记录水平方向棋子个数，初始值为0
        //向左
        for (int i = chessX; i >= 0; i--) {
            if (chessArr[chessY][chessX] == chessArr[chessY][i]) {
                c++;
                //统计同色棋子个数，每遇到一个同色棋子个数+1
            } else break;
        }
        //+1防止重复计入点击的点
        //向右
        for (int i = chessX + 1; i < chessArr.length; i++) {
            if (chessArr[chessY][chessX] == chessArr[chessY][i]) {
                c++;
            } else break;

        }
        if (c >= 5) {
            return c;
        }
        c = 0;

        //上
        for (int i = chessY; i >= 0; i--) {
            if (chessArr[chessY][chessX] == chessArr[i][chessX]) {
                c++;
                //统计同色棋子个数，每遇到一个同色棋子个数+1
            } else break;
        }
        //+1防止重复计入点击的点
        //下
        for (int i = chessY + 1; i < chessArr.length; i++) {
            if (chessArr[chessY][chessX] == chessArr[i][chessX]) {
                c++;
            } else break;

        }
        if (c >= 5) {
            return c;

        }
        c = 0;
        // 右下
        for (int i = chessX, j = chessY; i < chessArr.length && j < chessArr.length; j++, i++) {
            if (chessArr[chessY][chessX] == chessArr[j][i]) {
                c++;
            } else break;
        }
        //左上
        for (int i = chessX - 1, j = chessY - 1; i >= 0 && j >= 0; j--, i--) {
            if (chessArr[chessY][chessX] == chessArr[j][i]) {
                c++;
            } else break;
        }
        if (c >= 5) {
            return c;
        }
        c = 0;
        // 右上
        for (int i = chessX, j = chessY; i < chessArr.length && j >= 0; j--, i++) {
            if (chessArr[chessY][chessX] == chessArr[j][i]) {
                c++;
            } else break;
        }
        //左下
        for (int i = chessX - 1, j = chessY + 1; j < chessArr.length && i >= 0; j++, i--) {
            if (chessArr[chessY][chessX] == chessArr[j][i]) {
                c++;
            } else break;
        }
        if (c >= 5) {
            return c;
        }
        return c;
    }
}