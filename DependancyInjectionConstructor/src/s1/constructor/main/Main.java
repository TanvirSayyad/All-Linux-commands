package s1.constructor.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import s1.constructor.xmls.Animal;

public class Main {
	public static void main(String[] args) {
		String Path = "s1/constructor/reso/ApplicationContext.xml";

		ApplicationContext context = new ClassPathXmlApplicationContext(Path);


		Animal am = (Animal) context.getBean("Anim");
		am.Display();

	}

}
