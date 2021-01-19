package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
    当元素已经实现了Comparable接口，但是该比较规则则不满足
    我们排序需求时，也可以用重载的sort方法排序
 */
public class SortListDemo3 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("键");
        list.add("小泽a");
        list.add("泽错");

        Collections.sort(list,(o1,o2)->-(o1.length()-o2.length()));
        System.out.println(list);
    }
}
