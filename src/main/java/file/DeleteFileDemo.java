package file;

import java.io.File;

/*
   删除一个文件
 */
public class DeleteFileDemo {
    public static void main(String[] args) {
        /*
        相对路径下的"./"表示当前目录，不写默认值就是在当前目录下
         */
        //删除当前项目下的test.txt文件
        File file=new File("test.txt");
        if(file.exists()){
            file.delete();
            System.out.println("文件已删除");
        }else{
            System.out.println("文件不存在！");
        }
    }
}
