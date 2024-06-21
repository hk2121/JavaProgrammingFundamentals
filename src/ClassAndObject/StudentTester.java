package ClassAndObject;

public class StudentTester {
	public static void main(String[] args) {
		Student s = new Student();// object creation

		//use setter method to set the values 
		s.setStudentId(1001);
		s.setName("Jacob");
		s.setQualifyingExamMarks(80);
		s.setResidentialStatus('H');
		s.setYearOfEngg(3);

		// use getter method to display values 
		System.out.println("Student Name        : " + s.getName());
		System.out.println("Student Id          : " + s.getStudentId());
		System.out.println("Qualifying marks    : " + s.getQualifyingExamMarks());
		System.out.println("Year of Engineering : " + s.getYearOfEngg());
		System.out.println("Residential Status  : " + s.getResidentialStatus());
	}

}
