package file;

import java.io.File;

/*
删除一个目标
 */
public class DeleteDirDemo {
    public static void main(String[] args) {
        //将当前目录下的demo目录删除
        File file=new File("demo");
        if(file.exists()){
            //删除目录前提是该目标必须是个空项目
            file.delete();
            System.out.println("该目录已删除！");
        }else{
            System.out.println("该目录不存在");
        }


    }
}

