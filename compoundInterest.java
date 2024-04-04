package BasicDemos;

public class compoundInterest {

	public static void main(String[] args) {
		double amount=1500,principle=2.8,r=3.5,n=3,t=2;
		
		amount=principle+r;
		System.out.println("The amount is : "+amount);
		
		//compound interest
		
		amount=principle*(1+r/100)*t;
		
		System.out.println("Compund Intrest is : "+ amount);
	}
}
