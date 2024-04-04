package BasicDemos;

public class SumOfTwoNumber {
	
	/*
	 * int x; int y; int sum;
	 * 
	 * SumOfTwoNumber(){ x=10; y=20; sum=0; }
	 * 
	 * public void sumofnumber() { sum=x+y; System.out.println("The sum is : "+sum);
	 * }
	 * 
	 * public static void main(String[] args) { SumOfTwoNumber s1=new
	 * SumOfTwoNumber(); s1.sumofnumber(); }
	 */
	
	//Second Program
	
	/*
	 * double a,b,sum;
	 * 
	 * SumOfTwoNumber(double a,double b){ this.a=a; this.b=b; }
	 * 
	 * public void sum() { sum=a+b; System.out.println("Sum of two numbers : "+sum);
	 * }
	 * 
	 * public static void main(String[] args) { SumOfTwoNumber s2=new
	 * SumOfTwoNumber(12.4,45.9); s2.sum(); }
	 */
	
	//Third Program 
	//Concat To String
	
	String p,q,r;
	
	SumOfTwoNumber(){
		p="Naruto";
		q="Uzumaki";
	}
	
	public void concatstring () {
		r=p+q;
		System.out.println("Concat Two String : "+r);
	}
	
	public static void main(String[] args) {
		SumOfTwoNumber s3=new SumOfTwoNumber();
		s3.concatstring();
	}

}
