package BasicDemos;

public class Vararg_Foreach_Demo_2 {
	//default constructor
	Vararg_Foreach_Demo_2(){
		
	}
	//1st example
	//var-arg example
	private  void display(int...a) {
		for(int b:a) {
			System.out.println(b);
		}
		System.out.println("\n");
	}
     
	public static void main(String[] args) {
		Vararg_Foreach_Demo_2 arr=new Vararg_Foreach_Demo_2();
		arr.display(123456789);
		arr.display(1,2,3,4,5,6,7,8,9);
		
		//2ed example
		//Array and for each example
		float arr1[]={11f,22f,33f,44f,55f};
		for(float x:arr1) {
			System.out.println(x);
		}
		System.out.println("\n");
		
		//3rd example
		//Array and for each example
		int arr2[];
		arr2=new int[10];
		
		for(int y: arr2) {
			System.out.println(y);
		}
		

	}

}
