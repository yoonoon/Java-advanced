package com.soft1841.gui;

import javax.swing.*;

public class softWareFrom {
    private JPanel mainPanel;
    private JButton 上网必备Button;
    private JButton 游戏必备Button;
    private JButton 影音必备Button;
    private JButton 办公必备Button;

    public static void main(String[] args) {
        JFrame frame = new JFrame("softWareFrom");
        frame.setContentPane(new softWareFrom().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
