package BasicDemos;

public class OverloadingDemo3 {
	
	private int multiplication(int x,int b) {
		return x*b;
	}
	private float multiplication(float x,float y) {
		return x*y;
	}
	private double multiplication(double x,double y) {
		return x*y;
	}
	private int multiplication(int x,int b,int z) {
		return x*b*z;
	}

	public static void main(String[] args) {
		
		OverloadingDemo3 od1=new OverloadingDemo3();
		System.out.println("First method - " + od1.multiplication(43, 21));
		
		OverloadingDemo3 od2=new OverloadingDemo3();
		System.out.println("Second method - " +od2.multiplication(12, 5));
		
		OverloadingDemo3 od3=new OverloadingDemo3();
		System.out.println("Third method - " + od3.multiplication(12, 12));
		
		OverloadingDemo3 od4=new OverloadingDemo3();
		System.out.println("Fourth method - "+ od4.multiplication(12, 5, 7));
		

	}

}
