package polymorphismExample;



public class MethodOverloading2 {

		public void calculate() {
			System.out.println("Method is used to Calculating Area...");
		}
		public void calculate(int r) {
			System.out.println("Addittion = "+(r+r));
		}
		public void calculate(double x,double y) {
			System.out.println("Addittion = "+(x+y));
		}
		public void calculate(int...a) {
			int sum = 0;
			for(int i:a) {
				sum += i;
			}
			System.out.println("Addittion = "+sum);
		}
		
		//public void calculate(int val1, int val2) {
		//	System.out.println("Addittion = "+(val1+val2));
		//}
		//	public void calculate(int val1, int val2, int val3) {
		//		System.out.println("Addittion = "+(val1+val2));
		//}
		//public void calculate(int a, int b, int c, int d) {
		//	System.out.println("Addittion = "+(a+b+c+d)));
		//}
		
		
		public static void main(String[] args) {
			MethodOverloading2 add = new MethodOverloading2();
			add.calculate(1);
			add.calculate(1,54,33,55,23);
		}
}
