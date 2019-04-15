package com.soft1841.swing;


import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 *
 */
public class ColorThread extends Thread {
    private JPanel picturePanel;
    public void setPicturePanel(JPanel picturePanel){
        this.picturePanel=picturePanel;
    }
    @Override
    public void run(){
        Random random = new Random();

        while (true){
            int r = random.nextInt(256);
            int g = random.nextInt(256);
            int b = random.nextInt(256);
            picturePanel.setBackground(new Color(r,g,b));


            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

