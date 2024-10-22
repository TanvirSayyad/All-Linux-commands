package in.smartPrograming.Maven1stSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.bean.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		String path = "in/sp/Reso/ApplicationContext.xml";
		ApplicationContext app = new ClassPathXmlApplicationContext(path);
		Student std = (Student) app.getBean("Stud1");

		System.out.println(std.toString());

    }
}
