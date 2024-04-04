package BasicDemos;

//Basic setter and getter & Constructor program

public class Account {
	int accno;
	String ownername;
	double balance;

	// default constructor
	public Account() {
		System.out.println("Default constructor is called...");
		accno = 1234679;
		ownername = "Anmesh lad";
		balance = 10000.00;
		
	}
	//paramterised constructor
	public Account(int ano,String name,double bal) {
		accno=ano;
		ownername=name;
		balance=bal;
		System.out.println("parameterised constructor is called...");
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getownername() {
		return ownername;
	}

	public void setownername(String ownername) {
		ownername = ownername;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void displaydetails() {
		System.out.println("AccountNumber :"+accno+"  "+"AccountHolderName :"+ownername+"  "+"AccountBalance :"+balance);
	}

	public static void main(String[] args) {
        Account ac=new Account();//default constructor 
        ac.displaydetails();
       
        Account ac1=new Account(987123654,"Anita lad",31000.00);//parameterised constructor
        ac1.displaydetails();
        
	}
}
