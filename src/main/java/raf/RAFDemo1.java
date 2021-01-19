package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.RandomAccess;

/*
 java.io.RandomAccessFile
 RAF是专门用来读写文件数据的类，其基于指针对文件进行读写操作。
 */
public class RAFDemo1 {
    public static void main(String[] args) throws IOException {
        /*
            RAF的常用构造器
            RandomAccessFile（String path，String mode）
            RandomAccessFile(File file,String mode)
            第一个参数用于指定的要操作的文件，直接指定路径或者传入File对象即可。
            第二个参数之操作权限：
            r：只读权限，仅对文件做读取操作
            rw：对文件即可读也可写
         */
        //如果权限中含有“w”，则文件不存在时会自动创建出这个文件
        RandomAccessFile raf=new RandomAccessFile("./raf.dat","rw");
        /*
            void write(int d)
            写出一个字节，写出的是给定的int值所对应的2进制的”低8位“

            十进制：1
            二进制：00000000 00000000 00000000 00000001
         */
        raf.write(255);
        raf.write(2);
        /*
        上述两次写操作后，文件中的样子：
        00000001 00000010
         */
        System.out.println("写出完毕");
        raf.close();
    }
}
