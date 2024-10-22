package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {
		String ResorceFile="in/sp/Resources/Application.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(ResorceFile);
		Student std = (Student) context.getBean("Student");
		std.Display();
	}

}
