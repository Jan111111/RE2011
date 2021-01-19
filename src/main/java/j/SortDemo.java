package j;

import java.util.*;

public class SortDemo {
    public static void main(String[] args) {
        List<Emp>list=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户信息：姓名,年龄,性别,工资;...");
        String uesr=scanner.nextLine();
        String []arr=uesr.split("\\;");
        for(int i=0;i<arr.length;i++){
            String[] u=arr[i].split("\\,");
            Emp emp=new Emp(u[0],Integer.parseInt(u[1]),u[2],Double.valueOf(u[3]));
            list.add(emp);
        }
        System.out.println(list);
        for(Emp emp:list){
            System.out.println(emp);
        }
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                Double len1=o1.salary;
                Double len2=o2.salary;
                return (int)(-len1-len2);
            }
        });
        System.out.println(list);
    }
}
