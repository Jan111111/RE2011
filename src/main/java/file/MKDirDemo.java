package file;

import java.io.File;

/*
  创建一个目录
 */
public class MKDirDemo {
    public static void main(String[] args) {
    //当前目录下创建一个目录：demo
        File dir=new File("demo");
        if(dir.exists()){
            System.out.println("该目录已存在");
        }else{
            dir.mkdir();//要求创建的目录必须存在
            System.out.println("该目录已创建");
        }
        //dir.mkdir() 自动创建不存在的父目录 a/b/c/d/e/f

    }
}
