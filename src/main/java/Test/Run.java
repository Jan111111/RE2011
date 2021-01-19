package Test;

public class Run {
    public static void main(String[] args) {

    }
}
class RunPlay{
    private int hectometer=100;
    public void run(){
        try{
            Thread play = Thread.currentThread();
            System.out.println("准备开始比赛 倒计时5 4 3 2 1");
            Thread.sleep(5000);
            System.out.println("开始比赛");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
