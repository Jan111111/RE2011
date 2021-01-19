package Map;

import java.util.HashMap;
import java.util.Map;

/*
    java.util.Map 查找表
    Map是非常常用的数据结构，它体现的样子是一个多行两列的表格
    左列称为Key，右列称为value
    Map总是根据key获取对应的value

    常用实现类：java.util.HashMap 使用散列算法实现的Map，一般称它为
            散列表或哈希表。他也是当今查询速度最快的数据结构.
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer>map=new HashMap<>();
        /*
            V put(K k,V v)
            将一组键值对存入Map中

            Map有一个要求：Key不允许重复（equals比较）
            如果使用重复的key存入value时则会替换value操作，那么
            put方法的返回值为这个key原来的value
            如果这个key不存在则返回值为null

            获取put方法返回值时，如果value的类型是包装类，那么尽量
            不要用基本类型去接收，因为方法可能返回null，如果出现自动拆箱
            会导致空指针
         */
        Integer num=map.put("语文",89);
        System.out.println(num);
        map.put("化学",99);
        map.put("历史",86);
        map.put("英语",89);
        map.put("数学",87);

        System.out.println(map);
        num=map.put("数学",100);
        System.out.println(num);
        System.out.println(map);

        /*
            V get(Object key)
            根据Key获取Map中对应的value
            如果给定的key不存在则返回null
         */


        num=map.get("数学");
        System.out.println("数学："+num);

        /*
            V remove（Object key）
            删除Map中给定的Key所对应的键值时，返回值为这个Key
            所对应的value
         */
        num=map.remove("历史");
        System.out.println("历史："+num);
        System.out.println(map);

        //获取Map中的元素个数
        int size=map.size();
        System.out.println("size:"+size);

        //判断Map是否包含给定的Key
        boolean ck=map.containsKey("物理");
        System.out.println("包含key："+ck);
        //判断Map是否包含给定的value
        boolean cv=map.containsValue(99);
        System.out.println("包含value："+cv);

    }
}
