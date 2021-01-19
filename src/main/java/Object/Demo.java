package Object;
/*
测试object重写的方法
 */
public class Demo {
    public static void main(String[] args) {
        Point p=new Point(1,2);
        String str=p.toString();
        System.out.println(str);
        /*
           实际开发中，我们经常使用System.out.println(Object o)方法将一个对象信息输出到控制台，
           而这个方法实际输出的就是给定的对象toString方法返回的字符串

           Object提供的toString方法返回的字符串格式为：类名@地址
           这个格式实际开发中对我们帮助不大。
         */
        System.out.println(p);
        /*
           字符串连接操作也是很频繁的，其他引用类型与字符串连接时，也是会默认调用对象toString方法
           转换为字符串后再与字符串连接的。
         */

        System.out.println("该p对象的内容是"+p);


        Point p2=new Point(1,2);
        System.out.println(p == p2);
        System.out.println(p2.equals(p));



    }
}
