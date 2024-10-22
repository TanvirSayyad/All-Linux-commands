package in.sp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {
		String path = "/in/sp/reso/ApplicationContext.xml";
		ApplicationContext app = new ClassPathXmlApplicationContext(path);
		Student st = (Student) app.getBean("stud1");
		st.display();

	}

}
