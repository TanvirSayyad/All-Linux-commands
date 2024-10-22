package student.p1;


public class Student {

	Student() {
		System.out.println("default");

	}

	Student(int i) {
		System.out.println("parameter");

	}
	// making students subjects

	int Rollno;
	String name;
	String Sub;
	int marks;
	String Status;

	void StudList() {
		System.out.println("This is roll number" + Rollno);
		System.out.println("this is name " + name);
		System.out.println("this is subjects" + Sub);
		System.out.println("marks" + marks);
		System.out.println("status" + Status);

	}


}
