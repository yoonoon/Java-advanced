package com.soft1841.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimLoginFrom {
    private JPanel mainPanel;
    private JLabel bannerLabel;
    private JLabel avatarLabel;
    private JTextField textField1;
    private JTextField textField2;
    private JCheckBox 记住密码CheckBox;
    private JCheckBox 自动登录CheckBox;
    private JButton loginBtn;

    public TimLoginFrom() {
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"登陆成功");
            }
        });
    }

    public static void main(String[] args) throws Exception {
       // UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.windowsLookAndFeel");
        JFrame frame = new JFrame("TimLoginFrom");
        frame.setContentPane(new TimLoginFrom().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(444,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
