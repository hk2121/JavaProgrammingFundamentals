package ClassAndObject;

public class Accounts {

	private double balance = 500.0; // instance variable
	static int minBalance = 200; // static variable

	public double getBalance(int accountId) {
		int withdrawal = 500; // local variable
		return balance - withdrawal; 
	}

	public static void main(String[] args) {
		Accounts acc = new Accounts();
		double value = acc.getBalance(123456);
		// System.out.println(acc.minBalance);
		System.out.println(acc.balance);
		System.out.println("The balance is : " + value);
	}
}
