package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    JDK7之后，java推出了一个新的特性：自动关闭
    使得我们在IO操作中异常处理机制得以进一步精简代码
 */
public class AutoCloseableDemo {
    public static void main(String[] args) {
        try(    /*
                  只有实现了AutoCloseable接口的类才可以在这里定义，并且编译器编译代码
                  后会将其在finally中close，编译后的代码相当于是FinnalyDemo2的样子
                */
                FileOutputStream fos = new FileOutputStream("QCX.TXT");
                ) {
            fos.write(1);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
