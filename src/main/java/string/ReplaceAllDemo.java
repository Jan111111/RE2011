package string;
//替换
public class ReplaceAllDemo {
    public static void main(String[] args) {
        String str="abc123def456ghi789jkl";
        str=str.replaceAll("[0-9]+","#Number#");
        System.out.println(str);


        String strr=("nmsl|wqnmgbdsb|nc|cnm|wdnmd|djb");
        String message="nmsl，我顶cnm，djb，废柴";
        message=message.replaceAll(strr,"***");
        System.out.println(message);
    }
}
