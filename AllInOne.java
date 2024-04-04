package BasicDemos;

public class AllInOne {
	/*
	 * int x=12; int y=2;
	 * 
	 * public void Addition() { int z; z=x+y;
	 * System.out.println("The addition is : "+z); }
	 * 
	 * public void subtraction() { int a; a=x-y;
	 * System.out.println("The subtraction is : " +a); }
	 * 
	 * public void multiplication() { int o; o=x*y;
	 * System.out.println("The Multiplication is : "+o); }
	 * 
	 * public void division() { int p; p=x/y;
	 * System.out.println("The division is : "+p); }
	 * 
	 * public void remainder() { int r; r=x%y;
	 * System.out.println("The remainder is : "+r); }
	 */

	public static void main(String[] args) {
		/*
		 * AllInOne a1=new AllInOne(); a1.Addition(); a1.subtraction();
		 * a1.multiplication(); a1.division(); a1.remainder();
		 *
		 */
		
		int a,b,c;
		a=60;
		b=40;
		
		//addition of two numbers
		c=a+b;
		System.out.println("Addition of Two number is : "+c);
		
		//subtraction of two numbers
		c=a-b;
		System.out.println("Subtraction of two number is : "+c);
		
		c=a*b;
		System.out.println("Multiplication of Two number is : "+c);
		
		c=a/b;
		System.out.println("Dividesion of Two Number id : "+c);
		
		c=a%b;
		System.out.println("Remainder of Two number is : "+ c);
		
		
		
	}

}
