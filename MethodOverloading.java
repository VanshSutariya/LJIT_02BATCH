package polymorphismExample;

class shape{
	public void calculateArea() {
		System.out.println("Method is used to Calculating Area...");
	}
	public void calculateArea(int r) {
		System.out.println("Area of circle is "+(3.14*r*r));
	}
	public void calculateArea(double x,double y) {
		System.out.println("Area of Triangle is "+(0.5*x*y));
	}
	public void calculateArea(int val1, int val2) {
		System.out.println("Area of Rectangle is "+(val1*val2));
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape myShape = new shape();
		myShape.calculateArea();
		myShape.calculateArea(10);
		myShape.calculateArea(10,20);
		myShape.calculateArea(10.65,20.43);
	}

}
