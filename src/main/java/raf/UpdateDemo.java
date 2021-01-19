package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
    修改昵称功能
    程序启动后，要求用户输入用户名和新昵称，然后将user.dat文件中该用户的
    昵称进行修改，如果输入的用户不存在则输出"查无此人".

    思路：
    首先循环读取user.dat文件中每个用户的用户名并进行比对，如果找到该用户
    则将指针移动到该条记录的昵称位置，然后将新的昵称转换为字节数组后扩容
    到32字节并写入来覆盖原昵称信息.
 */
public class UpdateDemo {
    public static void main(String[] args) throws IOException {

        Scanner sca = new Scanner(System.in);

        System.out.println("请输入用户名");
        String username = sca.nextLine();
        RandomAccessFile raf = new RandomAccessFile("usere.dat", "rw");
        for (int i = 0; i < raf.length() / 100; i++) {
            raf.seek(i*100);
            byte[] data=new byte[32];
            raf.read(data);
            String name=new String(data).trim();
            if(name.equals(username)){
                System.out.println("有此人,请输入新昵称");
                raf.seek(i*100+64);
                String pickname=sca.nextLine();
                data=pickname.getBytes();
                data=Arrays.copyOf(data,32);
                System.out.println(data.length);
                raf.write(data);
                System.out.println("修改成功！");
                return;
            }
        }
        System.out.println("无此人");
        raf.close();
    }
}