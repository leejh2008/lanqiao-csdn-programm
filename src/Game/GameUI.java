package Game;

import javax.swing.*;
import java.awt.*;


/**
 * @author jinhong
 * @date 2026/8/12 21:27
 * @description
 */
public class GameUI {
    public GamePanel chessPanel;
    public JFrame jf;

    public void initUI() {
        //显示游戏界面
        jf = new JFrame();
        jf.setSize(900, 850);
        jf.setTitle("五子棋游戏");
        jf.setLocationRelativeTo(null);//窗口居中显示
        jf.setDefaultCloseOperation(3);//关闭窗口，退出进程

        //设置功能按钮面板
        JPanel eastPanel = new JPanel();
        eastPanel.setPreferredSize(new Dimension(80, 0));
        jf.add(eastPanel, BorderLayout.EAST);
        GameListener listener = new GameListener();
        //功能按钮
        //把jf.改成northPanel.
        //用数组简化原有设置
        String[] arr = {"开始", "复盘", "悔棋", "认输"};
        for (int i = 0; i < arr.length; i++) {
            JButton jbu = new JButton(arr[i]);
            eastPanel.add(jbu);
            jbu.addActionListener(listener);

        }

        GamePanel drawPanel = new GamePanel();//更改jpanel为mpanel

        jf.add(drawPanel, BorderLayout.CENTER);
        //设置可看见
        jf.setVisible(true);
        Graphics g = drawPanel.getGraphics();
        drawPanel.addMouseListener(listener);
        listener.gr = g;
        //将监听器传入窗口和棋盘
        listener.frame = jf;
        listener.panel = drawPanel;
        drawPanel.gamelistener = listener;
        drawPanel.chessList = listener.chessList;


    }

    public static void main(String[] args) {
        GameUI ui = new GameUI();
        ui.initUI();
    }

}
