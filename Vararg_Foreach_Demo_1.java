package BasicDemos;
//"vararg"&"for each loop" demo
public class Vararg_Foreach_Demo_1 {
	//for each loop demo
	public static void array() {
		int arr[]= {12,54,76,43};
		for (int i : arr) {
			System.out.println(i);
		}
		
	}
	//vararg demo
	public static void result(String nm, float marks) {
		
	}
	
	public static void add(int...num) {
		int sum=0;
		for (int temp : num) {
			sum=sum+temp;
			System.out.println("Sum is :" + sum);
		}
	}

	public static void main(String[] args) {
		add(1,2,3,4,5,6,7,8,9);
		System.out.println("\n");//"\n" used for shift to new line
		add(12,23,34,45,56,67);
		System.out.println("\n");
		array();

	}

}
