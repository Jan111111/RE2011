package Thread;
/*
    sleep方法要求必须处理中断异常InterruptedException
    当一个线程调用该方法处于睡眠阻塞的过程中，其中断方法interrupt（）被调用
    时，此时该线程的睡眠阻塞会被中断，sleep方法就会抛出中断异常
 */
public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin =new Thread(){
            public void run(){
                System.out.println("lin：美容完毕，准备sleep.！");
                try {
                    Thread.sleep(500000);
                } catch (InterruptedException e) {
                    System.out.println("干哈呢！？，我睡你姐夫啊，毁容了");
                }
                System.out.println("醒了");
            }
        };
        Thread wang=new Thread(){
          public void run(){
              System.out.println("wang：干饭了，干饭了！！");
              for(int i=0;i<5;i++){
                  System.out.println("50一碗！");
                  try {
                      Thread.sleep(1000);
                  } catch (InterruptedException e) {
                  }
              }
              System.out.println("卖完，收工，回家睡觉！！");
              lin.interrupt();
          }
        };
        lin.start();
        wang.start();
    }
}
