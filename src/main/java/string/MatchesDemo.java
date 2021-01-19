package string;

/**
 * boolean matches(String regex)
 * 使用给定的正则表达式验证当前字符串的格式
 */
public class MatchesDemo {
    public static void main(String[] args) {
        String email= "245dax@qq.com";
        /*
           email 的正则表达式 [a-zA-Z0-9_]+@[a-zA-Z]+(\.[a-zA-Z]+)+;
         */
        boolean match=email.matches("[a-zA-Z0-9_]+@[a-zA-Z]+(\\.[a-zA-Z]+)+");
        if(match){
            System.out.println("是邮箱");
        }else{
            System.out.println("不是邮箱");
        }

    }
}
