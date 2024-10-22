package in.sp.beans.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {

	public static void main(String[] args) {

		String App_path = "in/sp/res/ApplicationContext.xml";
		ApplicationContext ap = new ClassPathXmlApplicationContext(App_path);

		Student std = (Student) ap.getBean("studentBean");
		std.dispay();

		// TODO Auto-generated method stub

	}

}
