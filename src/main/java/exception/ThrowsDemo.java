package exception;
/*
   子类在重写超类含有throws声明异常抛出的方法时对throws的集中特殊的
   重写规则

 */

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsDemo {
    public void dosome() throws IOException, AWTException {
    }
}


class SubClass extends ThrowsDemo {
    //允许不再抛出任何异常
//      pubulic void dosome(){}

    //允许抛出超类方法抛出异常的部分异常
//      public void dosome（）throws IOException{}

    //允许抛出超类方法抛出异常的子类型异常
//      public void dosome()throws FileNotFoundException {}

    //不允许抛出额外异常（超类方法中没有的，且没有继承关系的）
//      public void dosome（）throws SQLException{}

    //不允许抛出超类方法抛出异常的超类型异常（只能让它小不能让它大）
//      public void dosome（）throws Exception{}

}
