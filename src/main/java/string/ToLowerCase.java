package string;

/**
 * 英文全小写
 */
public class ToLowerCase {
    public static void main(String[] args) {
        String line="我爱Jave";
        String lowe=line.toLowerCase();
        System.out.println(lowe);

        String str="A3fbC";
        String input="a3fBC";
        //if(str.toLowerCase().equals(input.toLowerCase())){//分个转
        if(str.equalsIgnoreCase(input)){//直接转
            System.out.println("验证通过~");
        }else{
            System.out.println("验证失败！！！！");
        }
    }
}
