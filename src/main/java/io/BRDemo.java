package io;

import java.io.*;

/*
    缓冲字符输入流：java.io.BufferedReader
    特点：块读文本数据，并且可以按行读取字符串

 */
public class BRDemo {
    public static void main(String[] args) throws IOException {
    //将Test2.txt文件读取出来并输出到控制台上
        FileInputStream fis=new FileInputStream("./src/main/java/io/BRDemo.java");
        InputStreamReader isr=new InputStreamReader(fis);
        BufferedReader br=new BufferedReader(isr);

        String i;
        /*
            String readLine（）
            缓存字符输入流提供了读取一行字符串的方法，该方法返回的字符串不含有该行字符串
            末尾的换行符。如果读取到空行（这一行只有换行符）则返回为空字符串。
            当返回值为null时，表示流读取到了末尾。对于读取文件而言就是读取到了文件末尾。
         */
        while((i=br.readLine())!=null){
            System.out.println(i);
        }
        br.close();


    }
}
