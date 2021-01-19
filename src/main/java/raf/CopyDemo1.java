package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo1 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src=new RandomAccessFile("raf.dat","r");
        RandomAccessFile desc=new RandomAccessFile("1.cn.png","rw");

        int d;//记录每次要复制的字节
        /*
            src:
            10001101

            d:
            00000000 00000000 00000000 10001101

            desc:
            10001101
         */
        long start=System.currentTimeMillis();
        while((d=src.read())!=-1){
            desc.write(d);
        }
        long end=System.currentTimeMillis();
        System.out.println("复制完毕,耗时"+(end-start)+"ms");
        src.close();
        desc.close();



    }
}
