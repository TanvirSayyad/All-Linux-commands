package in.sp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.reso.SpringConfig;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ap = new AnnotationConfigApplicationContext(SpringConfig.class);

		Student st = ap.getBean(Student.class);
		st.display();

	}

}
