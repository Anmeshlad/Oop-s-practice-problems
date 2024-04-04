package BasicDemos;

public class ClockDemo {
	int hours,min,sec;
	
	//setter and getter methods
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	
	
	public void initime() {
		hours=23;
		min=60;
		sec=60;
	}
	//this is a function
	public void displaytime() {
		System.out.println("Hour: "+ hours +" "+ "Minute: " + min + " "+ "Seconed :" + sec);
	}

	public static void main(String[] args) {
		ClockDemo c= new ClockDemo();
		ClockDemo c1=new ClockDemo();
		
		c.initime();
		c.setHours(22); //use setter method
		c.displaytime();
		
		c1.initime();
		c1.displaytime();
	}

}
