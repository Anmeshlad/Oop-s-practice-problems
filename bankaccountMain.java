package BasicDemos;

public class bankaccountMain {

	public static void main(String[] args) {
       bankaccount ba=new bankaccount();
       System.out.println(ba);
       ba.getInterestRate();
       
       bankaccount ba2=new bankaccount(2143546787,"IDB Pune");
       System.out.println(ba2);
       ba2.getInterestRate();
	}

}
