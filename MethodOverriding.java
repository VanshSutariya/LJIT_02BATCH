package polymorphismExample;

class Base{
	
	int a=10;
	final int b = 34;
	static int c = 23;
	
	public void show() {
		System.out.println("This is show...");
	}
	
}
class MyDerive extends Base{
	public void show() {
		super.a = 11;
		//super.b = 20;
		super.c = 30;
		System.out.println("This is Derived...");
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		MyDerive Obj = new MyDerive();
		Obj.show();
		
		System.out.println("==============================");
		
		Base base = new MyDerive();
		base.show();
	}
}
