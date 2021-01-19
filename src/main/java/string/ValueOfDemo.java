package string;

/**
 *将其他类型转换为字符型
 */
public class ValueOfDemo {
    public static void main(String[] args) {
        int i=123;
        String s1=String.valueOf(i);
        System.out.println(s1);

        s1=i+"";//也可以 只是上面性能更好
    }
}
