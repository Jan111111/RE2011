package Integer;
/*
JDK1.5版本推出时，出现一个新的特性，自动拆装箱
这个特性是编译认可的，让我们可以在源代码中基本类型与包装类型之间相互赋值使用
无需再而外编写相互转换的代码，编译器会在编译期间补充转换代码。
 */
public class IntegerDemo3 {
    public static void main(String[] args) {
        //这里触发了编译器的自动装箱特性，编译器会将代码改为：
        //Integer in=Integer.valueOf(123);
        Integer in=123;
        //这里触发了编译器的自动拆箱特性，编译器会将代码改为：
        //int i=in.intValue();
        int i=in;
    }
}
