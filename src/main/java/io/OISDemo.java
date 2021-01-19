package io;

import java.io.*;

/*
    使用对象输入流读取对象
 */
public class OISDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream("person.obj");
        ObjectInputStream ois=new ObjectInputStream(fis);
        /*
            对象输入流的readObject方法要求读取的字节必须是通过对象输出流将一个转换的字节
            才能做还原，否则会抛出ClassNotFoundException.
         */
        Person p=(Person)ois.readObject();//接收
        System.out.println(p);
        ois.close();


    }
}
