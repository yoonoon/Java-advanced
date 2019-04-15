package com.soft1841.swing;


import javax.swing.*;
import java.awt.*;

public class NumFrame extends JFrame{
    private JLabel numberLabel;
    private JLabel timeLabel;
    private JPanel colorJPanle;

    public NumFrame () {
        init();
        setTitle("随机数生成");
        setSize(1200, 741);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private void init () {
        numberLabel = new JLabel();
        timeLabel = new JLabel();
        Font font = new Font("微软雅黑",Font.BOLD,30);
        Font font1=new Font("微软雅黑",Font.ITALIC,25);
        numberLabel.setFont(font);
        timeLabel.setFont(font1);
        add(numberLabel,BorderLayout.SOUTH);
        add(timeLabel,BorderLayout.EAST);
        NumThread numThread = new NumThread();
        numThread.setNumberLabel(numberLabel);
        numThread.start();
        TimeThread timeThread = new TimeThread();
        timeThread.setTimeLabel(timeLabel);
        timeThread.start();
        colorJPanle =new JPanel();
        add(colorJPanle,BorderLayout.CENTER);
        ColorThread colorThread=new ColorThread();
        colorThread.setPicturePanel(colorJPanle);
        colorThread.start();
    }
    public static void main (String[] args) {
        new NumFrame();
    }
}
