package Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    线程池
    线程池是线程的管理机制，主要解决两个问题
    1：重用线程
    2：控制线程数量
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
    //创建线程池
        //创建一个指定大小的线程池，容量为2
        ExecutorService threadPool= Executors.newFixedThreadPool(2);
        //指派任务给线程池进行执行
        for (int i=0;i<5;i++){
            Runnable runn=new Runnable() {
                public void run() {
                    try{
                        Thread t=new Thread();
                        System.out.println(t.getName()+"正在执行任务..");
                        Thread.sleep(5000);
                        System.out.println(t.getName()+"执行任务完成！");
                    }catch (InterruptedException e){
                        System.out.println("中断了！");
                    }
                }
            };
            threadPool.execute(runn);//用线程池执行
            System.out.println("指派了一个任务给线程池");
        }
        //threadPool.shutdown();//做完才中断
        threadPool.shutdownNow();//立即中断
        System.out.println("");




    }
}
