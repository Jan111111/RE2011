package exception;

import java.net.Inet4Address;

/*
        java异常处理
        java中所有异常有一个统一的超类：Throwable
        Throwable下面有两个子类型：Error,Exception
        Error:这一类异常表示的都是系统错误，程序中我们通常不关心它们，因为只能妥协
        Exception：这一类异常表示的都是程序中出现的错误，比如由于逻辑错误导致的空指针，
                   下标越界等。通常我们在异常处理机制中只处理Exception这类问题。

        异常处理机制之try-catch
        语法：
        try{
            程序代码片段
        }catch（XXXException e）{
            当try中代码出现XXXException后的处理代码
        }


     */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始.");
        try {
            //String str = null;
           // String str="";
            String str="a";
        /*
        当JVM执行代码时发现出某种异常就会实例化这个异常的实例并将执行过程设置
        其中，然后将该异常抛出
        当JVM抛出异常后会检查抛出异常的代码有没有被异常处理机制包围，如果没有则会
        隐式将异常直接抛出到当前方法外（这个案例中就是抛出到main方法之外，交给调用
        main方法的代码片段去处理）
         */
            System.out.println(str.length());
            System.out.println(str.charAt(0));
            System.out.println(Integer.parseInt(str));

            //try语句中报错的代码以后的内容都不会被执行！
            System.out.println("!!!!!!!!");

        }catch (NullPointerException e){
            System.out.println("空指针");
        //cacth可以定义多个，这样就可以分别捕获不同的异常并分别进行处理
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("字符串下标越界");
        //在最后一个catch捕获Exception可以最大程度防止因未捕获的异常导致程序中断
        }catch(Exception e){
            System.out.println("反正有错");
        }
        System.out.println("程序结束.");

    }
}
