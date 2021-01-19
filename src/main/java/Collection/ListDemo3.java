package Collection;

import java.util.ArrayList;
import java.util.List;

/*
    List提供了获取子集的方法：

    List subList（int start，int end）
    获取当前集合中指定下标范围内的子集（含头不含尾）
 */
public class ListDemo3 {
    public static void main(String[] args) {
        //泛型只能指定引用类型，对于基本类型而言要指定对应的包装类.
        List<Integer>list=new ArrayList();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println(list);
        List<Integer>sublist=list.subList(3,8);
        System.out.println(sublist);

        //将子集中的每个元素扩大10倍
        for(int i=0;i<sublist.size();i++){
            sublist.set(i,sublist.get(i)*10);
            }
            System.out.println(sublist);
            /*
                原集合对应的元素也跟着发生了改变，
                因此对子集的操作就是对原集合对应元素的操作
             */
            System.out.println(list);

            //删除list集合中2-8的元素
            list.subList(2,9).clear();
            System.out.println(list);

    }
}
