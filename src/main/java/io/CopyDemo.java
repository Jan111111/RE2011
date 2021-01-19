package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
使用文件流完成文件的复制操作
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
    /*
    1.创建文件输入流用于读取原文件
    2.创建文件输出流用于向复制文件中写字节
    3.循环利用流块读写操作完成复制
    4.关闭两个流
     */
        FileInputStream fis=new FileInputStream("SOD.txt");
        FileOutputStream fos=new FileOutputStream("SOD_cp.txt");
        int len ;
        byte [] data=new byte[1024*10];
        while ((len=fis.read(data))!=-1){
            fos.write(data,0,len);
        }
        System.out.println("复制完毕");
        fis.close();
        fos.close();

    }
}
