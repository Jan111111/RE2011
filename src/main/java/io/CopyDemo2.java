package io;

import java.io.*;

/*
   缓冲字节流
   java.io.BufferedInputStream和BufferedOutputStream
   缓冲字节流是一对高级流，作用是加快字节的读写效率
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("SOD.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        FileOutputStream fos=new FileOutputStream("SOD._txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);

        int d;
        /*
            缓冲流内部维护一个字节数组，默认大小为8k，可以在创建时指定大小
            缓冲流最终将读写统一转换为块读写来保证读写效率.


         */
        while((d=bis.read())!=-1){
            bos.write(d);
        }
        System.out.println("复制完毕");
        bis.close();
        bos.close();

    }

}
