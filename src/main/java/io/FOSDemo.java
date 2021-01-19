package io;

import java.io.*;

/*
   java IO
   IO：输入与输出，input和output
   java将IO比喻为“流”，与电流，水流一样，是沿着同一个方向移动的过程。只不过java IO中的
   流中流动的是字节，所以我们也称他们为字节流

   java.io.InputStream和OutputStream是所有字节输入流与字节输出流的超类，它们是一对
   抽象类，本身不能实例化，只是规定了所有流的功能。
   InputStream中定义了读取字节的相关方法。所以输入流也是用于读取数据的流。
   OutputStream中定义了写出字节的相关方法。输出流用于写出数据的流。


   java将流划分为两类：
   节点流：无论输入与输出都包含这两类，节点流的特点是流链接的另一端是明确的，我们用过他
   能清晰的知道数据是从哪里来的或者哪里去了。他们也是真实"搬运"数据的流，读写程序一定
   是建立在节点流的基础上进行的。行业中也称节点流为低级流

   处理流：不能独立存在，必须链接在其他流上，目的是当数据“流经”当前处理流时对数据做某种
   加工操作，简化了我们对该 数据的操作。


   文件流：
   java.io.FileInputStream和FileOutputStream
   文件流继承自InputStream和OutputStream。并且是一对低级流，是连接我们的程序与文件
   之间的管道，负责读写文件数据的流.

 */
public class FOSDemo {
    public static void main(String[] args) throws IOException {
        /*
        使用文件流向文件中写入数据


        文件流常用构造方法：
        FileOutputStream（String fileName）
        FileOutputStream(File file)
        以上两种创建方式为覆盖写模式，即：创建文件流时如果指定的文件存在，会将该文件
        原有数据全部删除

        FileOutputStream（String fileName，boolean append）
        FileOutputStream（File file，boolean append）

        如果第二个参数为true则创建的文件流是追加模式，即：指定的文件存在时，原数据
        都会被保留，新写入的内容都会被追加到文件末尾

         */
      //  FileOutputStream out=new FileOutputStream("SOD.txt");
        FileOutputStream out=new FileOutputStream("SOD.txt",true);
       // String str="世界没那么多因果";
        // out.write(str.getBytes("UTF-8"));

        out.write(",只要有你陪伴".getBytes("UTF-8"));
        System.out.println("写出完毕");
        out.close();
    }
}
