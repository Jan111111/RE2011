package string;

/**
 * char charAt(int index)
 * 返回指定位置的字符
 */
public class CharAtDemo {
    public static void main(String[] args) {
        //           0123456789012345
        String line="thinking in java";
        char c=line.charAt(12);
        System.out.println(c);

        line="上海自来水来自海上";
        for(int i=0;i<line.length()/2;i++) {
            //正数位置的字符
            char c1 = line.charAt(i);
            char c2 = line.charAt(line.length() - 1 - i);
            if (c1 != c2) {
                System.out.println("不是回文");
                return;
             }
        }
            System.out.println("是回文");





    }
}
