package com.soft1841.thread.carouse;

import javax.swing.*;
import java.io.*;

public class CarouselThread implements Runnable {
    private String[] imgs = {"F:/carousel/1.jpg","F:/carousel/2.jpg","F:/carousel/3.jpg",
            "F:/carousel/4.jpg","F:/carousel/5.jpg", "F:/carousel/6.jpg"};
    private JLabel bgLabel;

    public void setBgLabel(JLabel bgLabel){ this.bgLabel = bgLabel;}
    @Override
    public void run(){
        int i = 0;
        int len = imgs.length - 1;
        while (true){
            try {
                File file = new File(imgs[i]);
                InputStream inputStream = new FileInputStream(file);
                byte[] bytes = new byte[(int)file.length()];
                inputStream.read(bytes);
                Icon icon = new ImageIcon(bytes);
                bgLabel.setIcon(icon);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
                if (i == len){
                    i = 0;
                }
            } catch (IOException e) {
                System.out.println("IO异常!");
            }
        }
    }
}
