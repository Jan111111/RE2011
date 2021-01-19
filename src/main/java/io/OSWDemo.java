package io;

import java.io.*;

/*
    字符流
    java.io.Reader和Writer是所有字符输入流与输出流的超类，其中定义了读取字符与写出字符
    的相关方法。
    字符流最小读写单位是字符，底层本质还是读写字节，但是字符与字节的转换有字符流完成。

    转换流：
    java.io.InputStreamReader和OutputStreamWriter
    它们是字符流常用实现类，在读写文本数据而组建流连接时是非常重要的环节，但是通常我们不会
    直接操作这两个流来读写文本数据。

    流连接：串联一组高级流并最终链接到某个低级流上，对低级流链接的设备进行读写操作。而读写过程
    中低级流负责搬运数据，过程中在经过各个高级流时，每个高级流对数据进行加工，使得数据在读写过程
    中完成所需要的处理。这种读写过程中以流水线式的加工操作简化我们的处理也是IO读写的精髓。



 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        //向文件写入文本数据
        FileOutputStream fos=new FileOutputStream("wri.txt");
        OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");

        osw.write("世间的美好。");
        osw.write("只因有你陪伴。");

        System.out.println("写出完毕");
        osw.close();
    }
}
