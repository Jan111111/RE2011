package string;

/**
 * 判断开头字符
 */
public class StartsWithDemo {
    public static void main(String[] args) {
        String line="www.baidu.com";

        boolean start=line.startsWith("www");
        System.out.println(start);
    }
}
