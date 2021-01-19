package string;
/*
   String类
   常量池：JVM在堆内存中开辟了一段空间用于缓存所有使用字面量（直接量）形式创建的字符串对象
   当我们再次使用这个字面量创建字符串对象时会自动重用，避免不必要的内存开销。
 */
public class string {
    public static void main(String[] args) {
        String s1="1354d";
        String s2="1354d";//自动重用s1指向的字符串对象
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println(s1==s2);//ture

        //new会强制创新一个新的对象
        String s3=new String("1354d");
        System.out.println(s2==s3); //地址false
        System.out.println(s2.equals(s3));//内容ture

        //确定一个计算表达
        String s5=135+"4d";
        System.out.println("s5:"+s5);
        System.out.println(s5==s2);//ture

        //有变量，不确定计算表达
        String s="135";
        String s6=s+"4d";
        System.out.println("s6:"+s6);
        System.out.println(s6==s2);//false

    }
}
