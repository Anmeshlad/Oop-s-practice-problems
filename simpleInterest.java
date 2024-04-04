package BasicDemos;

public class simpleInterest {
	
	public static void main(String[] args) {
		float interest=0f;
		float amount=15000f;
		float duration=2f;
		float rate=7f;
		
		interest=(amount*rate*duration)/100;
		
		System.out.println("Simple Intrest is :" + interest);
		
	}

}
