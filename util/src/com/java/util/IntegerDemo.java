package com.java.util;

/**
 * Integer类的练习
 * @author 王龙傲
 * 2019.3.12
 */
public class IntegerDemo {
    public static void main(String[] args) {
        int num = 31;
        String str1 = Integer.toBinaryString(num);
        System.out.println("二进制" +   str1);
        String str2 = Integer.toHexString(num);
        System.out.println("十六进制" +   str2);
        String str3 = Integer.toOctalString(num);
        System.out.println("八进制" +   str3);
        System.out.println("分割线-----------------");
        //调用自定义的进制转换方法
        System.out.println("转换为八进制" +   convert(num,8));

    }
    private static String convert(int num,int radix){
        //将num转为radix进制
        StringBuffer  stringBuffer = new StringBuffer();
        while (num!=0){
            int remainder = num% radix;
            stringBuffer.append(String.valueOf(remainder));
            num = num/radix;
        }
        return stringBuffer.reverse().toString();
    }
}
