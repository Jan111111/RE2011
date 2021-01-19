package file;

import java.io.File;
import java.io.FileFilter;

/*
  重载的listFiles方法，允许我们转入一个文件过滤器FileFilter，然后将满足过滤器要求
  的子项获取回来
 */
    public class ListFilesDemo2 {
        public static void main(String[] args) {
            //获取当前目录中所有的名字里含”s“的子项
            File dir=new File(".");
            if (dir.isDirectory()){
                MyFilter filter=new MyFilter();
                /*
                    重载的listFiles方法内部会使用给定的过滤器，将目录中所有子项都传入给过滤器
                    的方法accpet，并将返回值为true的子项最终返回.
                 */
                File[] subs=dir.listFiles(filter);
                System.out.println(subs.length);
                for(int i=0;i<subs.length;i++){
                    System.out.println(subs[i].getName());
                }
            }



        }
    }

