package ClassAndObject;

public class PerimeterCalculator {
	public static void main(String[] args) {
		// PerimeterCalculator peri = new PerimeterCalculator();
		Rectangle re = new Rectangle();
		re.setBreadth(30);
		re.setLength(30);
		re.calculatePerimeter();
		System.out.println("Rectangle is:- " + re.calculateRectangle());
	}
}
