package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
   对象流
   java.io.ObjectOutputStream和ObjectInputStream
   对象流是一对高级流，作用是将java对象与字节相互转换，方便我们读写java对象.
 */
public class OOSDemo {
    public static void main(String[] args) throws IOException {
        //将一个Person对象写入文件person.obj中
        String name="苍老师";
        int age=18;
        String gender="女";
        String []otherInfo= {"来自岛国","是一名演员"};
        Person p=new Person(name,age,gender,otherInfo);
        System.out.println(p);

        FileOutputStream fos=new FileOutputStream("person.obj");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        /*  ObjectOutputStream的方法：writeObject在写出对象时可能引发下列异常：
            java.io.NotSerializableException: io.Person

            出现这个异常是因为写出对象所属类没有实现接口：java.io.Serializable

            写出后，发现对应的字节比该对象实际保存的数据字节要大，这是因为转换的字节除了
            包含对象的数据之外，还要包含该对象的结构信息，将来便于还原.

            这个案例中的对象流链接在文件流上，将一个对象写入了文件。这里这两个流各自完成了
            一个环节的工作：
            对象流：将写出的对象按照其结构转换为一组字节，这个过程称为：对象序列化
            文件流：序列化后的字节再通过文件流写入了文件（写入磁盘），这个过程称为：数据持久化.
         */
        oos.writeObject(p);
        System.out.println("对象写出完毕");
        oos.close();

    }
}
