package file;

import java.io.File;

/*
   访问一个目录中的子项目
 */
public class ListFilesDemo {
    public static void main(String[] args) {
    //获取当前目录中的所有内容
        File dir=new File(".");
        /*
            boolean isFile()
            判断当前File表示的是否一个文件

            boolean isDirectory()
            判断当前File表示的是否为一个目录
         */

        if(dir.isDirectory()){
            /*
                File listFiles()
                获取该目录中的所有子项并以File数组形式返回，数组中的每一个元素就是其中的一个子项
             */
            File[] subs=dir.listFiles();
            System.out.println(subs.length);
            for(int i=0;i<subs.length;i++){
                System.out.println(subs[i].getName());
            }

        }
    }
}
