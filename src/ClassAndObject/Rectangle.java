package ClassAndObject;

public class Rectangle {

	public int length;
	public int breadth;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	

	public int calculateRectangle() {
		int ans = length * breadth; 
		return ans;
	}

	public void calculatePerimeter() {
		int peri = 2 * (length + breadth);
		System.out.println("Perimeter is :- " + peri);
	}

//	public static void main(String[] args) {
//		Rectangle re = new Rectangle();
//		re.setBreadth(30);
//		re.setLength(30);
//		System.out.println("Rectangle is :- " + re.calculateRectangle());
//	}
}
