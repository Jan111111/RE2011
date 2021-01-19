package exception;
    /*
        异常抛出
        throw关键字可以主动抛出一个异常，通常下列情况会主动抛出异常：
        1：程序遇到一个满足语法，但是不满足业务逻辑的情况（当前案例就是演示的这种情况）
        2：程序确实遇到了一个异常，但是该异常不应当在当前代码片段被解决时可以对外抛出。
     */
public class ThrowDemo {
        public static void main(String[] args) throws Exception {
            Person p=new Person();
            try {
                p.setAge(1000);//满足语法 但不满足业务
            }catch (IllegalAgeException e){
                e.printStackTrace();
            }
            System.out.println(p.getAge());

        }
}
