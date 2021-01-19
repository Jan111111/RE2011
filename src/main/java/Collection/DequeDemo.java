package Collection;

import java.util.Deque;
import java.util.LinkedList;

/*
    双端队列：java.util.Deque接口
    Deque继承Queue，双端队列是队列两端都可以做出入队操作的队列
    实现类：java.util.LinkedList
 */
public class DequeDemo {
    public static void main(String[] args) {
        Deque<String>deque=new LinkedList<>();
        deque.offer("one");
        deque.offer("two");
        deque.offer("three");
        System.out.println(deque);

        deque.offerFirst("four");//从队首方向入队
        System.out.println(deque);

        deque.offerLast("five");//从队尾方向入队（与offer一致）
        System.out.println(deque);

        String str=deque.poll();
        System.out.println(str);
        System.out.println(deque);
        //从队首方向出队，与poll（）方法一致
        str=deque.pollFirst();
        System.out.println(str);
        System.out.println(deque);
        //从队尾方向出队.
        str=deque.pollLast();
        System.out.println(str);
        System.out.println(deque);
    }
}
