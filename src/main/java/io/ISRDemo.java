package io;

import java.io.*;

/*
    使用转换流读取文本数据
 */
public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("wri.txt");
        InputStreamReader isr=new InputStreamReader(fis,"UTF-8");

        int len;
        while((len=isr.read())!=-1){
            System.out.print((char)len);
        }
        System.out.println("读取完毕");
        isr.close();
    }
}
