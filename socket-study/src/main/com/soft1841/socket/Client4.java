package main.com.soft1841.socket;

import java.io.*;
import java.net.Socket;

public class Client4 {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("10.40.133.7",1912);
        System.out.println("成功链接服务器");
        File file = new File("F:/1.jpg");
        byte[] b = new byte[(int) file.length()];
        InputStream is = new FileInputStream(file);
        is.read(b);
        BufferedOutputStream bos = new BufferedOutputStream(client.getOutputStream());
        bos.write(b);
        bos.close();
        is.close();

    }
}
