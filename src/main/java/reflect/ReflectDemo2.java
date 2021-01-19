package reflect;

import java.util.Scanner;

/*
    实例化操作
 */
public class ReflectDemo2 {
    public static void main(String[] args) {
        Person p=new Person();
        System.out.println(p);



        try {


//            Class cls=Class.forName("reflect.Person");
            Scanner scanner=new Scanner(System.in);
            System.out.println("请输入一个实例化类的类名");
            String name=scanner.nextLine();
            Class cls=Class.forName(name);
            Object o=cls.newInstance();//注意：必须有无参构造器，且是public的.
            System.out.println(o);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
