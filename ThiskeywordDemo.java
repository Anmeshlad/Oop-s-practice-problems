package BasicDemos;

public class ThiskeywordDemo {
	int d;
	int m;
	int y;
   //default constructor
	public  ThiskeywordDemo() {
		d = 3;
		m = 6;
		y = 2022;
	}
    //parameterised constructor
	public ThiskeywordDemo(int d, int m, int y) {
		//removing shadow instance field
		this.d = d;
		this.m = m;
		this.y = y;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void displaydate() {
		System.out.println("Date -"+d+"/"+m+"/"+y);
	}

	public static void main(String[] args) {
		 ThiskeywordDemo t=new ThiskeywordDemo();
	     t.displaydate();
	     
	     ThiskeywordDemo t1=new ThiskeywordDemo(4,5,1999);
	     t1.displaydate();
		

	}
}
