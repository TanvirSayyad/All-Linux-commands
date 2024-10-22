package hrs9.c1.jtc;

class Student{
	//inside class without static called instance variable
	
	int sid; //instance variable
	String name;//instance variable
	 static String country="india";//only once memory will be allocated
	 
	 {// this block will be call until object is call
		 System.out.println("instance block");
	 }
	 
	 static {
		 System.out.println("static block in Student");
	 }
	 Student(){
		 //body of condstrucator
		 System.out.println("default constructotr in student ");
	 }
	 Student(int id){
		 System.out.println("this is id"+id);
	 }
	 void StudentDetails() {
		 
		 //body of method
		 System.out.println("Show details in student");
		 
	 }
	 static void showfewdetails() {
		 System.out.println("show fee details");
	 }
	
}

public class Jtc1 {
	public static void main(String[] args) {
		Student st1 =new Student();
		
//	class loading or not check ,class load only once when we call object
		
		//when object is create he only check class will always loaded at once
		Student st2 =new Student(12);
//
//		Student st3=new Student();

		
		st2.StudentDetails();
		
		/// how load class 
		
		System.out.println("static method"+Student.country);
		

		//
		Student.showfewdetails();
		
	}

}
