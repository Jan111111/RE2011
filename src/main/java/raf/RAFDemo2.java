package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
从文件中读取字节
 */
public class RAFDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=new RandomAccessFile("./raf.dat","r");
        /*
        int read()
        读取一个字节并以int形式返回，该int值的“低八位”就是读取到的字节，如果返回值为
        -1则表示读取到了文件末尾.
        00000000 00000000 00000000 11111111
         */
        int d=raf.read();
        System.out.println(d);
        d=raf.read();
        System.out.println(d);
        d=raf.read();
        System.out.println(d);

    }
}
