package BasicDemos;
//static Example
public class bankaccount {
	int accno;
	String branch;
	static float interestRate;
	
	static {
		interestRate=7;
	}
	
	public bankaccount() {
		accno=123465879;
		branch="IDB satara";
	}
	 public bankaccount(int a, String b) {
		 this.accno=a;
		 this.branch=b;
	 }
	 
	 public static void getInterestRate() {
		 System.out.println("Interest is :"+interestRate);
	 }
	 
	 public String toString() {
		 return "Bank AccountNumber :"+accno+ " & Branch :" +branch;
	 }

}
