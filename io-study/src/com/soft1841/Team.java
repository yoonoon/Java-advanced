package com.soft1841;

public class Team {
    public static void main(String[] args) {
        System.out.println("球员入场：");
        A a=new A();
        a.start();
        B b=new B();
        b.start();
    }
}
class A extends Thread{
    @Override
    public void run() {
        for (int i = 1 ; i <=11; i++){
            System.out.print("a" + i+" ");
        }
    }
}
class B extends Thread{
    @Override
    public void run() {
        for (int j =1; j<=11;j++){
            System.out.print("b"+j + " ");
        }
    }
}
