package com.soft1841.thread.timer;

import java.sql.Time;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
    public static void main(String[] args) {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("hello");

            }
        };
        TimerTask task1 = new TimerTask() {
            @Override
            public void run() {
                System.out.println(new Date());
            }
        };
        Timer timer = new Timer();
        timer.schedule(task,0,1000);
        timer.schedule(task1,0,2000);
    }
}
