package j;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("ok.txt");
        list.add("hello.jpg");
        list.add("day01.rar");
        list.add("world.jpg");
        list.add("no.txt");
        System.out.println(list);
        List<String> str=list.subList(1,4);
        System.out.println(str);
        for(int i=0;i<str.size();i++){
            if(str.get(i).contains(".jpg")){
                str.set(i,str.get(i).replace("jpg","png"));
            }
        }
        System.out.println(list);
    }
}
