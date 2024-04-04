package BasicDemos;

public class ComplexNumber {

	int real;
	int img;

	// default constructor
	public ComplexNumber() {
		real = 10;
		img = 2;
	}

	// Parameterised constructor
	public ComplexNumber(int realN, int imgN) {
		real = realN;
		img = imgN;
	}

	ComplexNumber Add(ComplexNumber c1, ComplexNumber c2) {
		ComplexNumber c3 = new ComplexNumber();
		real = c1.real + c1.real;
		img = c2.img + c2.img;
		return c3;
	}

	// setter and getter methods
	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		real = real;
	}

	public int getImg() {
		return img;
	}

	public void setImg(int img) {
		img = img;
	}

	// display function
	public void display() {
		System.out.println("The complex number is :" + real + "+" + img + "i");
	}

	public static void main(String[] args) {
		ComplexNumber c1 = new ComplexNumber();
		c1.display();
		ComplexNumber c2 = new ComplexNumber(12, 54);
		c2.display();

		ComplexNumber result = new ComplexNumber();
		result = c1.Add(c1, c2);
		System.out.println("Addition of complenumber is : " + result);

	}

}
