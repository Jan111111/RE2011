package string;

public class SplitDemo {
    public static void main(String[] args) {
        String str= "abc123def456ghi789jkl";
        String[] data=str.split("[0-9]+");
        System.out.println(data.length);
        for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }
    }
}
