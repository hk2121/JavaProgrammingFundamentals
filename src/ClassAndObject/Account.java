package ClassAndObject;

public class Account {
	private double balance = 500.00;

	//created method 
	public double getbalance(int x) {
		return balance;
	}

	public static void main(String[] args) {
		Account acc = new Account();
		double value = acc.getbalance(12345);
		System.out.println("The balance is : " + value);
	}
}
