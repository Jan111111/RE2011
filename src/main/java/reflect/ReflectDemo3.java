package reflect;

import java.lang.reflect.Constructor;

/*
    使用有参构造器进行实例化
 */
public class ReflectDemo3 {
    public static void main(String[] args) {
        Person p=new Person("苍老师",55);
        System.out.println(p);


        try {
            Class cls = Class.forName("reflect.Person");
        //使用该构造器实例化：public Person（String name,int age）
            Constructor c =cls.getConstructor(String.class,int.class);
            Object o=c.newInstance("小刘",18);
            System.out.println(o);
         } catch (Exception e) {
        e.printStackTrace();
        }

    }
}
