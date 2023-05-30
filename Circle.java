
import java.util.*;

public class Circle {
    double pi = 3.14;
    double radius;
    double area;
    double circumference;

    public void setData() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius");
        radius = sc.nextDouble();
        sc.close();
    }

    public void getData() {

        area = pi * radius * radius;
        System.out.println("Area of Circle :" + area);

    }

    public static void main(String Args[]) {
        Circle c1 = new Circle();
        c1.setData();
        c1.getData();
    }

}
