package Drawtoolsix;

import javax.swing.*;
import java.awt.*;

/**
 * @author jinhong
 * @date 2026/8/7 22:02
 * @description
 */
public class MPanel extends JPanel {
    //保存图形的数据
    public Shapes []shapeArr;
    //重写paint方法
    public void paint(Graphics g){
        //保留绘制组件的功能
        super.paint(g);
        System.out.println("paint");
        for(int i=0;i<shapeArr.length;i++){
            Shapes shape=shapeArr[i];
            if(shape==null)
                break;
                shape.drawShape(g);

        }
    }

}
