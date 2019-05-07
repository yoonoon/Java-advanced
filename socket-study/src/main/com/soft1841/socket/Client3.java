package main.com.soft1841.socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client3 {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost",10086);
        System.out.println("成功链接服务器");
        Scanner scanner = new Scanner(System.in);
        BufferedWriter brf;
        System.out.println("输入一行信息：");
        String str = scanner.nextLine();
        brf = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        brf.write(str);
        brf.flush();
        brf.close();

    }
}
