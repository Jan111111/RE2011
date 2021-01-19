package io;

import java.io.*;

/*
    在流连接中使用PW
 */
public class PWDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("ec.txt");//低，将字节写入文本
        OutputStreamWriter oos=new OutputStreamWriter(fos);//字符字节转换
        BufferedWriter bw=new BufferedWriter(oos);//加速 需要满一次才走
        PrintWriter pw=new PrintWriter(bw,true);//刷新 换行

        pw.println("你好！");
        pw.println("世间的美好！");
        pw.close();
    }
}
