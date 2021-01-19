package string;

/*
    String的设计和优化导致其不适合频繁修改，效率差，开销大
    对此java提供了一个专门用来修改字符串的API：StringBuilder

    java.lang.StringBuilder内部维护一个可变的char数组，并提供了便于修改字符串内容的相关
    操作：增删改插等.
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        String str="好好学习java";

        StringBuilder builder=new StringBuilder(str);
        builder.append(",为了工作!");//增
        String s=builder.toString();//转换字符串
        System.out.println(s);

        builder.replace(9,13,"为了更好的明天");
        System.out.println(builder.toString());


        builder.delete(0,8);
        System.out.println(builder.toString());

        builder.insert(0,"活着");
        System.out.println(builder.toString());

        builder.reverse();
        System.out.println(builder);
    }
}
