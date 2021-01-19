package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/*
  完成简易记事本工具
  程序启动后要求用户输入一个文件夹，然后对该文件进行写操作
  之后用户在控制台输入的每一行为内容都要写入到文件中.
  当用户单独输入“exit”时程序退出.


  注:写入文件中的数据不需要考虑换行问题
 */
public class Note {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入一个文件夹");
        String str=scan.nextLine();
        RandomAccessFile raf=new RandomAccessFile(str,"rw");
        System.out.println("请输入内容");
        for(;;){
        String str1=scan.nextLine();
            if (str1.equals("exit")) {
                System.out.println("已退出");
                break;
        }
        byte[] date = str1.getBytes("UTF-8");
        raf.write(date);
        }
        System.out.println("写出完毕");
        raf.close();



    }
}
