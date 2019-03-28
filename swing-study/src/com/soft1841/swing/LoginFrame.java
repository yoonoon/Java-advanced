package com.soft1841.swing;

import com.sun.org.apache.xml.internal.security.Init;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {
    private JLabel accountLabel,passwordLabel,roleLabel;
    private JTextField accountField;
    private JPasswordField passwordField;
    private JComboBox<String> roleComboBox;
    private JButton confirmButton,cancelButton;
    private JLabel bgLabel;

    public LoginFrame(){
        init();
        setTitle("登录窗口");
        setSize(640,640);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private void init(){
        Font font = new Font("微软雅黑",Font.PLAIN,18);
        accountLabel = new JLabel("账号");
        accountLabel.setFont(font);
        accountField = new JTextField();
        accountField.setFont(font);
        passwordLabel = new JLabel("密码");
        passwordLabel.setFont(font);
        passwordField = new JPasswordField();
        passwordField.setFont(font);
        roleLabel = new JLabel("角色");
        roleLabel.setFont(font);
        String[] roles = {"教师","学生"};
        roleComboBox = new JComboBox<>(roles);
        roleComboBox.setFont(font);
        confirmButton = new JButton("确认");
        confirmButton.setFont(font);
        cancelButton = new JButton("取消");
        cancelButton.setFont(font);
        setLayout(null);
        accountLabel.setBounds(120,100,100,35);
        accountField.setBounds(250,100,300,35);
        passwordLabel.setBounds(120,160,100,35);
        passwordField.setBounds(250,160,300,35);
        roleLabel.setBounds(120,230,100,35);
        roleComboBox.setBounds(250,230,260,35);
        confirmButton.setBounds(100,300,180,50);
        confirmButton.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.blue));
        cancelButton.setBounds(380,300,180,50);
        cancelButton.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
        add(accountLabel);
        add(accountField);
        add(passwordLabel);
        add(passwordField);
        add(roleLabel);
        add(roleComboBox);
        add(confirmButton);
        add(cancelButton);
        bgLabel = new JLabel();
        Icon bgicon = new ImageIcon(LoginFrame.class.getResource("/img/l.jpg"));
        bgLabel.setIcon(bgicon);
        bgLabel.setBounds(0,0,640,640);
        add(bgLabel);
    }

    public static void main(String[] args) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        }catch (Exception e){
            e.printStackTrace();
        }
        new LoginFrame();

    }
}
