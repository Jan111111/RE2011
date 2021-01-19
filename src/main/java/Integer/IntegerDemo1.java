package Integer;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/*
    包装类
    包装类的出现是为了解决基本类型不能直接参与面向对象开发的问题，
    使得我们可以让基本类型以对象的形式存在。
 */
public class IntegerDemo1 {
    public static void main(String[] args) {


    int d=123;
    //java推荐我们使用valueOf形式创建包装类
    Integer i1=Integer.valueOf(d);
    Integer i2=Integer.valueOf(d);
        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));//包装类自动重写了equals


     double dou=123.123;
     Double d1=Double.valueOf(dou);
     Double d2=Double.valueOf(dou);
        System.out.println(d1==d2);//false Double不重用对象
        System.out.println(d1.equals(d2));//true

        //包装类型转换为基本类型
        double dou1=d1.doubleValue();
        System.out.println(dou1);
        int dou2=d2.intValue();
        System.out.println(dou2);


    }
}
