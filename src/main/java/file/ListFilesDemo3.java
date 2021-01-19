package file;

import java.io.File;
import java.io.FileFilter;

/*
使用匿名内部类创建文件过滤器
 */
public class ListFilesDemo3 {
    public static void main(String[] args) {
        //获取当前目录中所有的名字里含”s“的子项
        File dir=new File(".");
        if (dir.isDirectory()){
            File[] subs=dir.listFiles(new FileFilter() {
                @Override
                public boolean accept(File file) {
                    return file.getName().contains("s");
                }
            });
            System.out.println(subs.length);
            for(int i=0;i<subs.length;i++){
                System.out.println(subs[i].getName());
            }
        }
    }
}
