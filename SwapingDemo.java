package BasicDemos;

/*public class SwapingDemo {
	static int a;
	static int b; // static int c;

	SwapingDemo(int a, int b) {
		this.a = a;
		this.b = b;

	}
    
	public static void swap() {
		int c;
		c = a;
		a = b;
		b = c;
	}

	public static void showvalues() {
		System.out.println("before swaping the values is " + a + " & " + b);
	}

	public String toString() {
		return "After swaping the values is :" + a + " & " + b;
	}

	public static void main(String[] args) {
		SwapingDemo s1 = new SwapingDemo(12, 23);
		showvalues(); // after swaping the values swap();
		System.out.println(s1);

	}
}*/

public class SwapingDemo {
	static String a;
	static String b;

	SwapingDemo(String a, String b) {
		this.a = a;
		this.b = b;
	}

	public void swapstrings() {
		String c;
		c = a;
		a = b;
		b = c;
	}

	public void showswapvalues() {
		System.out.println("Before swaping the values: " + a + " <==> " + b);
	}

	public String toString() {
		return "After the swaping the values: " + a + " <==> " + b;
	}

	public static void main(String[] args) {
		SwapingDemo s2 = new SwapingDemo("Nobi", "Deku");
		s2.showswapvalues();
		s2.swapstrings();
		System.out.println(s2);

	}

}
