package BasicDemos;

public class PersonStaticDemo {
	int age;
	String name;
    static String city;//static variable
    static int count;
    
    //static block
    static {
    	city="mumbai";
    	count=0;
    }
	
	//defalut Constructor
	public  PersonStaticDemo() {
		age=24;
		name="Ram";
		count++;
	}
	//parameterised constructor
	public  PersonStaticDemo(int a,String n,String c) {
		age=a;
		name=n;
		city=c;
		count++;
	}
	
	public void displydetails() {
		System.out.println("Person age "+age+" &"+" name "+name +" & city "+city);
	}
	
	//static methods/function
	static void updatecity() {
		city="Pune";
	}
	//static function 
	static void showcount() {
		System.out.println("Total count is "+count);
	}

	public static void main(String[] args) {
		PersonStaticDemo ps=new PersonStaticDemo();
		ps.displydetails(); //before update the city name
		
		PersonStaticDemo ps2=new PersonStaticDemo(25,"veer","satara");
		ps2.displydetails();
		
		PersonStaticDemo.showcount();
		PersonStaticDemo.updatecity();
		ps.displydetails(); //after the update  city name
		ps2.displydetails();
		
		
		
		

	}

}
