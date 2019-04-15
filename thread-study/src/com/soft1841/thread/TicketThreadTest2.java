package com.soft1841.thread;

public class TicketThreadTest2 {
    public static void main(String[] args) {
        TicketThread2 tt =  new TicketThread2();
        Thread thread1 = new Thread(tt);
        thread1.start();
        Thread thread2 = new Thread(tt);
        thread1.start();
        Thread thread3 = new Thread(tt);
        thread1.start();
    }
}
class TicketThread2 implements Runnable{
    private int tickets = 10;
    @Override
    public void run() {
        while (tickets > 0){
            System.out.println(Thread.currentThread().getName() + "售票，当前票数： " + --  tickets );
        }
    }
}