package p1;
import java.util.*;
public class Circle {
	
	final double PI = 3.14;
	
	public int radius() {
		System.out.println("Please Enter Radius of Circle : ");
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		System.out.println("Radius of circle is : "+radius);
		return radius;
	}
	
	public void area(int r) {
		double area = PI*r*r;
		System.out.println("Area of circle is "+area);
	}
	
	public void circumference(int r) {
		double circumference = 2*PI*r;
		System.out.println("Circumference of circle is "+circumference);
	}
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		int radius = c1.radius();
		c1.area(radius);
		c1.circumference(radius);
		;
	}
}