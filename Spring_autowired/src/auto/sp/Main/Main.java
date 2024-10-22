package auto.sp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import auto.sp.bean.Address;
import auto.sp.bean.Student;
import auto.sp.config.ConfigurationFile;

public class Main {

	public static void main(String[] args) {

		ApplicationContext app = new AnnotationConfigApplicationContext(ConfigurationFile.class);
		Address ad = app.getBean(Address.class);
		Student st = app.getBean(Student.class);
		st.display();


		// TODO Auto-generated method stub

	}

}
