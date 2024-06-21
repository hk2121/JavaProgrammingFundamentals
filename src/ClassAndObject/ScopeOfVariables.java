package ClassAndObject;

public class ScopeOfVariables {

	int i = 34; //instance variable
	static int z; //class variable
	static {
	z=10;
	System.out.println("Inside Static Block : "+z);
	}
	void test(){
		int k = 20; //local variable
		System.out.println("Local Variable : "+(k+i));
	}
	public static void main(String[] args) {
		ScopeOfVariables sc = new ScopeOfVariables();
		sc.test();
		System.out.println("i : "+sc.i);
}
}
