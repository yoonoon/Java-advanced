package com.soft1841.gui;

import javax.swing.*;

public class CloudMusicFrom {
    private JPanel mainPanel;
    private JPanel leftPanel;
    private JButton 搜索Button;
    private JButton 发现Button;
    private JButton MVButton;
    private JButton 朋友Button;
    private JPanel centerPanel;


    public static void main(String[] args) {
        JFrame frame = new JFrame("CloudMusicFrom");
        frame.setContentPane(new CloudMusicFrom().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}