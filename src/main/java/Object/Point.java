package Object;

import java.util.Objects;

/*
    使用当前类测试 Object中常被重写的方法
    point 表示直角坐标系中的一个点
 */
public class Point {
    private  int x;
    private  int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    /*
        toString方法返回的字符串格式没有硬性要求，可以根据实际开发需求而定，
        但是原则上返回的字符串中会包含当前类中各项属性的信息
     */
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
