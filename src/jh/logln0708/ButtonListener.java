package jh.logln0708;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author jinhong
 * @date 2026/7/10 16:36
 * @description
 */
public class ButtonListener implements ActionListener {
    public String user ="123";
    public String truepassward="1234";

    public JTextField userText;
    public JPasswordField passwordField;
    public JFrame loginFrame;

    @Override
    public void actionPerformed(ActionEvent e) {
        String userName=userText.getText();
        String password=new String(passwordField.getPassword());
        if(user.equals(userName)&&truepassward.equals(password)) {
            System.out.println("yes");
            loginFrame.dispose();
            JFrame jf=new JFrame();
            jf.setSize(420,500);
            jf.setTitle("首页");
            jf.setLocationRelativeTo(null);
            jf.setDefaultCloseOperation(3);
            jf.add(new JLabel("欢迎进入登录页面"));
            jf.setVisible(true);



        }else {
            System.out.println("no");
            loginFrame.dispose();
            JFrame FJ=new JFrame();
            FJ.setSize(420,500);
            FJ.setTitle("首页");
            FJ.setLocationRelativeTo(null);
            FJ.setDefaultCloseOperation(3);
            FJ.add(new JLabel("账号或密码错误"));
            FJ.setVisible(true);
        }
            System.out.println("点击按钮！userName="+userName);

    }
}
