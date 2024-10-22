package student.p1;

public class StudRunner {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();

		s1.Rollno = 1;
		s1.name = "Tanvir";
		s1.marks = 88;
		s1.Sub = "Maths";
		s1.Status = "Pass";

		s2.Rollno = 2;
		s2.name = "Tanvir";
		s2.marks = 89;
		s2.Sub = "Maths";
		s2.Status = "Pass";

		s1.StudList();
		s2.StudList();

	}

}
