package BasicDemos;

public class Friends {
	String fname,lname;
	int age;
	double weight;
   
	private void initdata() {
		 fname="Akshay";
		 lname="Mane";
		 age=25;
		 weight= 56.8;
		 
	}
	
	private void showdata() {
		 System.out.println("FirstName -" + " " + fname +" " + "LastName -" +lname + " " +" age -" + age +" " + "Weight -" + weight);
	}

	public static void main(String[] args) {
		
		Friends f= new Friends();
		
         f.initdata();
         f.showdata();
         
	}

}
