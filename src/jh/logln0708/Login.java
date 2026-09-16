package jh.logln0708;

/**
 * @author jinhong
 * @date 2026/7/8 22:13
 * @description
 */
  import javax.swing.*;
  import java.awt.*;



public class Login {
    public void showUI(){
        JFrame jf = new JFrame();
        jf.setSize(420,500);
        jf.setTitle("登录界面");
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(3);

        FlowLayout flow = new FlowLayout();
        jf.setLayout(flow);

        ImageIcon image = new ImageIcon("C:Users\\lrlh8\\OneDrive\\图片\\Screenshots\\2.png");

        JLabel jla =new JLabel(image);
        jf.add(jla);

        JLabel user =new JLabel("账号:");
        jf.add(user);

        JTextField jtf=new JTextField();

        Dimension dm =new Dimension(340,30);
        jtf.setPreferredSize(dm);
        jf.add(jtf);

        JLabel pass=new JLabel("密码");
        jf.add(pass);
        JPasswordField jpf=new JPasswordField();
        jpf.setPreferredSize(dm);
        jf.add(jpf);

        JButton jbu=new JButton("登录");
        jf.add(jbu);


        ButtonListener listener=new ButtonListener();
        jbu.addActionListener(listener);
        listener.userText=jtf;
        listener.passwordField=jpf;
        listener.loginFrame=jf;
        jf.setVisible(true);

    }

    public static void main(String[] args) {
        Login lo=new Login();
        lo.showUI();



    }
}
