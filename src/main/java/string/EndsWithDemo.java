package string;

/**
 * 判断结束字符
 */
public class EndsWithDemo {
    public static void main(String[] args) {
        String line="www.baidu.com";

        boolean start=line.endsWith("www");
        System.out.println(start);
    }
}
