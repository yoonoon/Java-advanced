package com.java.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

/**
 * 随机颜色
 *
 *
 */
public class RandomColor {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int red = random.nextInt(256);
        System.out.print("R:"+red);
        int green = random.nextInt(256);
        System.out.print(" G:"+green);
        int blue = random.nextInt(256);
        System.out.print(" B:"+blue);
        //开始使用随机色值绘制图片
        //在图片缓冲区生成一个图像,指定图像大小类型
        BufferedImage bufferedImage = new BufferedImage(120,40,BufferedImage.TYPE_INT_RGB);
        //获取画笔
        Graphics g = bufferedImage.getGraphics();
        //设置字体
        Font font = new Font("微软雅黑",Font.BOLD,16);
        g.setFont(font);
        //设置画笔颜色
        Color color = new Color(red,green,blue);
        g.setColor(color);

        //开始绘制矩形，充满缓冲区
        g.fillRect(0,0,120,40);
        g.setColor(Color.BLACK);
        g.drawString("验证码",40,15);
        //输出图片
        File file = new File("F:/00.jpg");
        //获取自己输出流
        OutputStream outputStream = new FileOutputStream(file);
        //将图片从缓冲区通过字节流写到文件
        ImageIO.write(bufferedImage,"jpg",outputStream);
        //
        outputStream.close();














    }
}
