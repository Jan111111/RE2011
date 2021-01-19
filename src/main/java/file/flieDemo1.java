package file;

import java.io.File;

/*
   java.io.File
   File的每一个实例可以表示硬盘上的一个文件或目录（实际上表示的是一个抽象路径，如果该路径恰好在硬盘上存在并
   对应文件或目录时就直接表示他们）
   通过File我们可以：
   1.获取其表示的文件或目录的属性（文件大小、名字等）
   2.创建或删除文件和目录
   3.获取一个目标中的所有子项

   但不能访问文件数据（java有其他API都可以）
 */
public class flieDemo1 {
    public static void main(String[] args) {
        File file=new File("./Demo.txt");

        String name=file.getName();
        System.out.println(name);

        long len=file.length();
        System.out.println(len+"字节");


        boolean cr=file.canRead();//可读
        System.out.println(cr);
        boolean cw=file.canWrite();//可写
        System.out.println(cw);


        boolean ih=file.isHidden();//可隐藏
        System.out.println(ih);



    }

}
