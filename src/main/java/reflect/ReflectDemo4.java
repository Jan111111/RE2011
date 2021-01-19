package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/*
    调用方法
 */
public class ReflectDemo4 {
    public static void main(String[] args) {
        Person p=new Person();
        p.sayHello();

        try {
            Scanner scanner=new Scanner(System.in);
            System.out.println("请输入类名");
            String classname=scanner.nextLine();
            System.out.println("请输入方法名");
            String methodname=scanner.nextLine();
            Class cls=Class.forName(classname);
//          Class cls= Class.forName("reflect.Person");
            Object o=cls.newInstance();//实例化
            //获取sayHello方法
            Method method =cls.getMethod(methodname);
//          Method method =cls.getMethod("sayHello");
            method.invoke(o);//p.sayHello()
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
