package com.soft1841;

import java.io.*;
import java.util.UUID;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        //指定源文件
        File srcFile = new File("F:/l.jpg");

        String srcFileName = srcFile.getAbsolutePath();

        int position =  srcFileName.indexOf(".");

        String suffixName = srcFileName.substring(position + 1);

        String newName = UUID.randomUUID().toString();
        //指定目标文件
        File destFile = new File("G:/l.jpg" + newName + "." + suffixName);
        //创建一个字节数组，大小为源文件长度，长度转换为int
        byte[] bytes = new byte[(int) srcFile.length()];
        //创建字节输入流
        InputStream in = new FileInputStream(srcFile);
        //将源文件读入字节数组
        in.read(bytes);
        //创建字节输出流
        OutputStream out = new FileOutputStream(destFile);
        //将字节流输出
        out.write(bytes);
        //关闭
        in.close();
        out.close();
    }
}
