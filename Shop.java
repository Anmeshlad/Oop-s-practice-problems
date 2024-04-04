package BasicDemos;

public class Shop {

	int shopid;
	String shopname;
	static String location;
	static int totalshop;

	static {
		location = "satara";
		totalshop = 10;
	}

	 Shop() {
		shopid = 012054;
		shopname = "Shree jernal store";
		totalshop++;
	}

	 Shop(int id, String name,String location) {
		this.shopid = id;
		this.shopname = name;
		this.location=location;
		totalshop++;
	}

	public static void Show() {
		System.out.println("Total shop is " + totalshop);
	}

	public String toString() {
		return "All Shop's Details : "+shopid+ "/"+shopname+ " /"+location;
	}

	public static void main(String[] args) {
		Shop s1=new Shop();
		System.out.println(s1);
		Shop.Show();
		
		Shop s5=new Shop();
		System.out.println(s5);
		Shop.Show();
		
		Shop s2=new Shop(2143,"Om Medical","sadar bazar");
		System.out.println(s2);
		Shop.Show();
		
		Shop s3=new Shop(5467,"Raj Kirana Store","kodoli");
		System.out.println(s3);
		Shop.Show();
		
		Shop s4=new Shop(6598,"sarthak mall","povai naka");
		System.out.println(s4);
		Shop.Show();
		
		

	}

}
