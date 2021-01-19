package exception;
/*
    异常处理异常机制中的finally块是异常处理机制中的最后一块，可以直接跟在try之后或者最后一个
    catch之后.
    finally块可以保证只要程序执行到try语句块中，无论try中的代码是否抛出异常，finally都必定
    执行。
    通常我们将释放资源这类操作放在finally中，比如IO操作后的close.
 */
public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("程序开始");
        try {
            String str = "";
            System.out.println(str.length());
            return;
        }catch (Exception e){
            System.out.println("出错了");
        }finally{
            System.out.println("finally必定执行");
        }
        System.out.println("程序结束");
    }
}
