package lambda;

import java.io.File;
import java.io.FileFilter;

/*
lambda 表达式 JDK8之后推出一个新的特性
使用lambda的直观感受是可以用更精简的语法创建匿名内部类

语法：
    （参数列表）->{
    方法体
    }
    lambda表达式实现的接口不需要写接口的名字以及方法名，但是要求该接口只能有一个抽象方法

 */
public class lambdaDemo1 {
    public static void main(String[] args) {
        File dir=new File(".");
        if(dir.isDirectory()){
            File [] subs=dir.listFiles((f)-> {
                    return f.getName().contains("s");
            });

            /*
            lambda表达式实现的方法如果只有一句代码，那么方法的{}可以省略
            如果含有return关键字的话，那么省略{}同时也要省略return
             */
            // （f）->return f.getName().contanins("s");

            System.out.println(subs.length);
            for(int i=0;i<subs.length;i++){
                System.out.println(subs[i].getName());
            }
        }
    }

}


