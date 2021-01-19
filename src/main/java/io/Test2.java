package io;

import sun.util.resources.es.CurrencyNames_es_EC;

import java.io.*;
import java.util.Scanner;

/*
    简易记事本工具
    程序启动后要求用户输入文件名，然后对该文件写操作，如果该文件存在，提示用户是重新写
    还是追加写。 输入Y时重新写 输入N时追加写

    之后将控制台输入的每行字符串都按行写入到文件中，单独输入exit时程序退出。

    自动完成流连接

 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入文件名");
        String userfile = sca.nextLine();
        File file=new File(userfile);
        boolean append=false;
        if (file.exists()) {
            System.out.println("文件存在，输入y重新写，输入n追加写");
            String user=sca.nextLine();
            if("n".equalsIgnoreCase(user)){
                append=true;
            }
        }
        FileOutputStream fos=new FileOutputStream(file,append);
        OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
        BufferedWriter bw=new BufferedWriter(osw);
        /*
            PrintWriter在创建时如果有一个参数一个流，那么构造方法就支持再传入一个
            boolean型的参数，表示自动行刷新，如果传入是true就打开了该功能，此时每
            当我们调用println方法写出一行字符串后就会自动flush.

         */
        PrintWriter pw=new PrintWriter(bw,true);
        System.out.println("请输入内容，exit退出");
        while(true){
            String line =sca.nextLine();
            if("exit".equalsIgnoreCase(line)){
                break;
            }
            pw.println(line);
        }
        System.out.println("再见");
        pw.close();
    }
}
