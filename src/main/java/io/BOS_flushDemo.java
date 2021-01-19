package io;

import java.io.*;

/*
    缓冲输出流的缓冲区问题
 */
public class BOS_flushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("bos.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        bos.write("一给我的giao~~~".getBytes("UTF-8"));
        /*
           flush方法可以强制要求缓存流将已经缓存的数据一次性写出。
           频繁调用flush会降低写出效率但是能达到写出数据的即时性。
         */
        //bos.flush();
        System.out.println("写出完毕！");
        bos.close();
    }
}
