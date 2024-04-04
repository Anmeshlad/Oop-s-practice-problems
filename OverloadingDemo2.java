package BasicDemos;

public class OverloadingDemo2 {
	
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public float multiply(int a,int b,int c) {
		return a*b*c;
	}
	
	public static void main(String[] args) {
		
		OverloadingDemo2 o=new OverloadingDemo2();
		System.out.println("First multiply method result is " + o.multiply(21,5));
		
		OverloadingDemo2 o2=new OverloadingDemo2();
		System.out.println("Second multiply method result is " + o2.multiply(5, 12, 5));
		

	}

}
