package main.com.soft1841.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client5 {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("192.168.43.140", 10086);
        System.out.println("成功连接上服务器！");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String s = bufferedReader.readLine();
        System.out.println("服务器给您发送了一条消息："+s);
        bufferedReader.close();
        bufferedReader.close();
    }
}
