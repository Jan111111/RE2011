package io;

import javax.print.DocFlavor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
  文件输入流
 */
public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("SOD.txt");

        byte [] data=new byte[1000];
        int leng=fis.read(data);
        System.out.println("实际输出"+leng);
        /*
           String的构造方法：
           String（byte[]data，int offset，int leng，String charsetName）
           将给定的字节数组从下标offset处连续leng个字节按照指定的字符集转换为字符串
         */
        String str=new String(data,0,leng,"utf-8");
        System.out.println(str);
        System.out.println(str.length());
        fis.close();
    }
}
