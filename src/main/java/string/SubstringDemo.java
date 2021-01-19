package string;

/**
 * String substring(int start,int end)
 * 截取一条字符串
 * 含头不含尾
 */
public class SubstringDemo {
    public static void main(String[] args) {
        String line="www.tedu.cn";
        String sub=line.substring(4,8);//范围4——7
        System.out.println(sub);
        sub=line.substring(4);//范围4之后
        System.out.println(sub);


        String h1="www.ceecv.com";
        String h2="www.erwfvwvwr165.com";
        String h3="www.xwxwxw515646wc.com";

        String s1=getName(h1);
        System.out.println(s1);
        String s2=getName(h2);
        System.out.println(s2);
        String s3=getName(h3);
        System.out.println(s3);

    }
    public static  String getName(String host){
        int start=host.indexOf(".")+1;
        int end=host.indexOf(".",start);
        return host.substring(start,end);
    }

}
