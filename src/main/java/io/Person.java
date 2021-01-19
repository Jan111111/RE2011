package io;

import java.io.Serializable;
import java.util.Arrays;

/*
  使用当前类测试对象流的对象读写操作

  Serializable接口中没有任何抽象方法需要我们实现，这个接口称为签名接口，是编译器敏感
  的特殊接口，当一个类被编译器编译时，如果该类实现了Serializable接口，那么编译器在编
  译的class文件中会添加一个方法，作用是将当前类实例化转换一组字节，对象流就是基于这个
  方法进行的序列化操作。



 */
public class Person implements Serializable {
    private String name;
    private int age;
    private String gender;
    //被transient修饰的属性在序列化时会被忽略
    private transient String[] otherInfo;

    public Person(String name, int age, String gender, String[] otherInfo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherInfo = otherInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }
}
