package MXJTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 在一个List集合中生成20个随机整数(100以内)
 * 然后按照从小到大的顺序排列，排好后再将第6个-第15个元素
 * 按照从大到小顺序排列，并最终输出集合
 * 例如:
 * 1,2,3,4,5,15,14,13,12,11,10,9,8,7,6,16,17,18,19,20
 * @author pc
 *
 */
public class Day12Demo1 {
    public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		Random rand=new Random();
		for(int i=0;i<20;i++) {
			list.add(rand.nextInt(100));
		}
		Collections.sort(list);
		System.out.println(list);
		List<Integer>sublist=list.subList(5,15);
		Collections.sort(sublist,(o1,o2)->-(o1-o2));
		System.out.println(sublist);
		System.out.println(list);
    }
}
