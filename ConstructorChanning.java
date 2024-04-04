package BasicDemos;

public class ConstructorChanning {

	int a;
	int b;
	
    //Constructor Channing using 'This' reference
	public ConstructorChanning() {
		this(12, 3);
	}

	public ConstructorChanning(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void disply(int i, int j) {
		System.out.println("Output -"+a+" , "+b);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public static void main(String[] args) {
		ConstructorChanning cc = new ConstructorChanning();
		cc.disply(12,4);

		

	}

}
