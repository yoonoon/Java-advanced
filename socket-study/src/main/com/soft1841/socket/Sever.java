package main.com.soft1841.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class Sever {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        System.out.println("服务器启动");
        while (true){
            Socket socket = ss.accept();
            ServerThread serverThread =  new ServerThread();

        }
    }
}
class ServerThread implements Runnable{
    private Socket socket;
    @Override
    public void run() {

    }
}
