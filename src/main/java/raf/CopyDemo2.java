package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 通过提高每次读写的数据量，减少实际读写的次数可以提高读写效率

 单字节读写是随机读写形式
 一组字节的读写时块读写形式
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src=new RandomAccessFile("./ppt.pptx","r");
        RandomAccessFile desc=new RandomAccessFile("./ppt_cp2.pptx0","rw");
        /*
          int read(byte[] data)
          一次性从文件中读取给定的字节数组总长度的字节量并存入到该
          数组中，返回值为实际读取到的字节量

          void write(byte[] date,int offset,int len)
          一次性将给定字节数组中从下标offset处开始的连续len个字节写入文件
         */

        int len;
        byte[] data=new byte[1024*10];//10kb
        long start=System.currentTimeMillis();
        while ((len=src.read(data))!=-1){
            desc.write(data,0,len);
        }
        long end=System.currentTimeMillis();
        System.out.println("复制完毕！耗时"+(end-start)+"ms");
        src.close();
        desc.close();

    }

}
