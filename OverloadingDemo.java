package BasicDemos;

//methods overloadingDemo

public class OverloadingDemo {
	
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public int add(int a,int b,int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		OverloadingDemo od=new OverloadingDemo();
		System.out.println(od.add(12, 54));
		System.out.println(od.add(23,56 , 87));

	}

}
