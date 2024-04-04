package BasicDemos;

public class CEO {
	int CEOID;
	String CEOName;
	float CEOSalary;
	static int count;
	
	static {
		count=0;
	}
	static void showcount() {
		System.out.println("Total count is "+count);
	}
	
	CEO(){
		CEOID=895632457;
		CEOName="Sundar Pichai";
		CEOSalary=100000;	
		count++;
	}
	
	CEO(int id,String name,float sal){
		this.CEOID=id;
		this.CEOName=name;
		this.CEOSalary=sal;
		count++;
	}
	
	public String toString() {
		return "Company CEO Id :"+CEOID+ ", CEO Name :"+CEOName + " & Salary :"+CEOSalary;
	}
	

	public static void main(String[] args) {
		CEO c1=new CEO();
		System.out.println(c1);
		CEO.showcount();
		
		CEO c2=new CEO(674765872,"Sidarth Mheta",900000);
		System.out.println(c2);
		CEO.showcount();
		
		CEO c3=new CEO(2154879,"Ram Mane",870000);
		System.out.println(c3);
		CEO.showcount();

	}

}
