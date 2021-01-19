package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {

    /*
      实现一个简易记事本
      程序启动后要求用户输入一个文件名，然后对这个文件写操作
      之后在控制台输入每一行字符串都写入到文件中。如果单独输入exit则程序退出。
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("请输入一个文件名");
        String filename=scan.nextLine();
        FileOutputStream fos=new FileOutputStream(filename,true);
        while(true){
            System.out.println("请输入内容");
            String usercz=scan.nextLine();
            if("exit".equals(usercz)) {
                break;
            }
            fos.write(usercz.getBytes("utf-8"));
        }
        System.out.println("写出完毕");
        fos.close();

    }
}
