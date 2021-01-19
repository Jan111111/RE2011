package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/*
    缓冲字符流
    java.io.BufferedWriter和BufferedReader 缓冲字符输出流和输入流
    缓冲流内部维护一个缓冲区，可块读写文本数据提高读写效率，并且缓冲流可以按行读写字符串

    java.io.PrintWriter具有自动行刷新的缓冲字符输出流，开发中使用频率高，内部总是会链接
    BufferedWriter作为缓冲功能。
 */
public class PWDemo1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        //向文件中写入文本数据
        PrintWriter pw=new PrintWriter("dexw.txt","UTF-8");
        pw.println("世间的美好");
        pw.println("只想与你欣赏");

        pw.close();
    }
}
