package com.soft1841.swing;

import javax.swing.*;
import java.util.Random;

public class NumThread extends Thread{
    private JLabel numLabel;

    public void  setNumberLabel(JLabel numLabel){
        this.numLabel=numLabel;
    }
    @Override
    public void run(){
        Random random=new Random();
        while (true){
            int num=random.nextInt(100);
            numLabel.setText(String.valueOf(num));
            try {
                Thread.sleep(1000);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
