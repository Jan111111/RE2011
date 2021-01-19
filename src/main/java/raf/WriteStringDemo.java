package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;

/*
   向文件中写入文本数据（字符串）
 */
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=new RandomAccessFile("raf.txt","rw");

        String str="wwe我来了！！！！";
        /*
            String提供了将当前字符串转换为一组字节的方法;
            byte[] getBytes（String csn）;
            参数为指定的字符集名字，常用的：UTF—8
            当字符集名字指定错误是，会抛出如下异常：不支持的字符集异常
            UnsupportedEncodingException:UFT-8
         */
        byte[] date=str.getBytes("UTF-8");
        raf.write(date);
        System.out.println("写出完毕！");
        raf.close();



    }
}
