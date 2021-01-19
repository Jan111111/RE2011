package Integer;
/*
包类常用功能介绍
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        //得到最大值及最小值
        int imax=Integer.MAX_VALUE;
        System.out.println(imax);
        int imin=Integer.MIN_VALUE;
        System.out.println(imin);

        double dmax=Double.MAX_VALUE;
        System.out.println(dmax);
        double dmin=Double.MIN_VALUE;
        System.out.println(dmin);

        /*
          包装类有一个静态方法：parseXXX（String str）
          可以将字符串解析为对应的基本类型，但是前提是该字符串正确描述了基本类型
          可以保存的值，否则会抛出异常：NumberFormatException
         */
        String str="123";
        int d=Integer.parseInt(str);
        System.out.println(d);
        double dou=Double.parseDouble(str);
        System.out.println(dou);
    }
}
