package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.reso.ConfigurationFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
	{
		int id = 0;
		int age = 25;
		String name = "Tanvir";

		ApplicationContext app = new AnnotationConfigApplicationContext(ConfigurationFile.class);
		JdbcTemplate jdbcTemplate = app.getBean(JdbcTemplate.class);
		// we added jdbc class here beause we want to perrform operations

//		String query = "INSERT INTO Student VALUES(?,?,?)";
//		int count = jdbcTemplate.update(query, id, age, name);
//
//		if (count > 0) {
//			System.out.println("Added values");
//
//		} else {
//			System.out.println("not");
//		}

//		int a = 29;
//		String s = "Arbaj";
//
//		int count = jdbcTemplate.update("UPDATE Student set age=?,name=? where id=?", a, s, 1);
//
//		if (count > 0) {
//			System.out.println("Success");
//
//		}
		String n="Sanket";
		
		//delete row
		int count = jdbcTemplate.update("DELETE FROM Student WHERE name=?", n);

		if (count > 0) {
			System.out.println("deleted");
		}
		
    }
}
