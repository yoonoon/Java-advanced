package com.soft1841.thread.carouse;

import javax.swing.*;
import java.awt.*;

public class CarouselFrame extends JFrame {
        private JLabel bgLabel;

    public CarouselFrame() {
        init();
        setTitle("图片阅读器");
        setSize(new Dimension(1920, 1080));
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void init() {
        bgLabel = new JLabel();
        add(bgLabel);
        CarouselThread ct = new CarouselThread();
        ct.setBgLabel(bgLabel);
        new Thread(ct).start();
    }

    public static void main(String[] args) {
        new CarouselFrame();
    }
}
