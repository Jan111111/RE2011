package exception;
/*
    使用当前类测试异常抛出
 */
public class Person {
    private int age;

    public int getAge() {
        return age;
    }
    /*
        throws是在声明方法的同时声明该方法可能抛出的异常，使调用者处理该异常
        当前方法中使用throw抛出什么异常就要在方法上使用throws声明该异常的抛
        出。只有一类异常是特殊的：RuntimeException，除此之外都是必须的。
     */

    public void setAge(int age) throws IllegalAgeException{
        if(age<0||age>100){
            //使用throw主动对外抛出一个异常
            //throw new Exception("年龄不合法");
            throw new IllegalAgeException("年龄不合法"+age);
        }
        this.age = age;
    }
}
