package MXJTest;

import java.io.*;

/*
   java.io.RandomAccessFile
   RAF是专门用来读写文件数据的类，其基于指针对文件进行读写操作
   java.io.InputStream和OutputStream
   字节输入流与字节输出流的超类
   InputStream中定义了读取字节的相关方法。所以输入流也是用于读取数据的流。
   OutputStream中定义了写出字节的相关方法。输出流用于写出数据的流。
 */
public class RAFandIO {
    public static void main(String[] args) throws IOException {






//        RandomAccessFile src=new RandomAccessFile("./dexw.txt","r");
//        RandomAccessFile desc=new RandomAccessFile("./dexw.txt2","rw");
//        FileInputStream src=new FileInputStream("SOD.txt");
//        FileOutputStream desc=new FileOutputStream("SOD_1.txt");
        /*
            Copy 块读写
         */
//        int len;
//        byte[] data=new byte[1024*10];//10kb
//        while ((len=src.read(data))!=-1) {
//            desc.write(data, 0, len);
//        }
//        System.out.println("复制完毕");
//        src.close();
//        desc.close();

        /*
            RandomAccessFile 指针
         */
//        RandomAccessFile raf=new RandomAccessFile("SOD.txt","rw");
//        long pos=raf.getFilePointer();
//        System.out.println("指针位置："+pos);
//        int max=Integer.MAX_VALUE;
//        raf.writeInt(max);
//        raf.writeLong(123456L);
//        raf.writeDouble(123.123);
//        pos=raf.getFilePointer();
//        System.out.println("指针位置："+pos);
//
//
//        raf.seek(0);
//        pos=raf.getFilePointer();
//        System.out.println("指针位置："+pos);

//
//        raf.close();


        /*
            流的作用
         */
        //输入流
//        FileInputStream fis=new FileInputStream("./src/main/java/io/BRDemo.java");
//        InputStreamReader isr=new InputStreamReader(fis);
//        BufferedReader br=new BufferedReader(isr);

        //输出流
//        FileOutputStream fos=new FileOutputStream("ec.txt");//低，将字节写入文本
//        OutputStreamWriter oos=new OutputStreamWriter(fos);//字符字节转换
//        BufferedWriter bw=new BufferedWriter(oos);//加速 需要满一次才走
//        PrintWriter pw=new PrintWriter(bw,true);//刷新 换行
            //序列化后通过文件流写入磁盘---数据持久化


        /*
            不同点
         */

        /*
            相同点
         */
    }
}
