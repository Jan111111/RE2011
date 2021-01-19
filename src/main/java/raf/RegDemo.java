package raf;
/*
   完成用户注册功能
   程序启动后，要求用户输入：用户名，密码，昵称和年龄、
   然后将该用户信息写入user.dat中

   设计：
   每条记录占用100字节，其中用户名、密码、昵称各占32字节，年龄
   是int值固定4字节
   字符串故意留白可以方便后期的修改，并且还可以让长度固定、统一，便于读取.
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RegDemo {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        System.out.println("欢迎注册！！！！！");
        System.out.println("请输入用户名？？");
        String username=scan.nextLine();
        System.out.println("请输入密码");
        String password=scan.nextLine();
        System.out.println("请输入昵称？？");
        String pickname=scan.nextLine();
        System.out.println("请输入年龄？？");
        int age=scan.nextInt();

        RandomAccessFile raf=new RandomAccessFile("usere.dat","rw");
        raf.seek(raf.length());//返回末尾

        byte[] date=username.getBytes("UTF-8");
        date= Arrays.copyOf(date,32);
        raf.write(date);

        date=password.getBytes("UTF-8");
        date= Arrays.copyOf(date,32);
        raf.write(date);

        date=pickname.getBytes("UTF-8");
        date= Arrays.copyOf(date,32);
        raf.write(date);

        raf.writeInt(age);
        System.out.println("注册完毕    "+username+","+password+","+pickname+","+age);
        raf.close();

    }
}
