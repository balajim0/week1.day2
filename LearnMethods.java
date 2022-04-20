package week1.day2;

public class LearnMethods {
	public static void main(String[] args) {
		// ClassName objectName = new ClassName();
		LearnMethods obj = new LearnMethods();
		// objectName.methodName();
		obj.printCarName();
		int carRegNumber = obj.getCarRegNumber();
		System.out.println(carRegNumber);
		String carVarient = obj.getCarVarient();
		System.out.println(carVarient);
		//System.out.println(obj.getCarVarient());
		double multiply = obj.multiplyTwoNumbers(5,5.5);
		System.out.println(multiply);	
	}
	public void printCarName() {
		System.out.println("TATA");
	}
	public int getCarRegNumber() {
		int getCarRegnumber = 1234;
		return getCarRegnumber;

	}
	public String getCarVarient() {
		return "multidrive";
	}
	public double multiplyTwoNumbers(int a, double b) {
		return a*b;

	}
}
