package in.smartPrograming.NamedParameterJDBC;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.sm.reso.ConfigBy;

public class App {
	private static String date;

	public static void main(String[] args) {
		ApplicationContext ap = new AnnotationConfigApplicationContext(ConfigBy.class);
		NamedParameterJdbcTemplate named = ap.getBean(NamedParameterJdbcTemplate.class);
		Map<String, Object> map = new HashMap<String, Object>();

        map.put("name", "Tanvir");
        map.put("salary", 380);
        map.put("date", Date.valueOf("2024-05-18"));  // Use java.sql.Date for the date

        // Insert query excluding 'id' (auto-incremented)
        String insertQuery = "INSERT INTO EMPLOY (name, salary, date) VALUES (:name, :salary, :date)";
        
        int count = named.update(insertQuery, map);

        // Output result
        if (count > 0) {
            System.out.println("Data inserted successfully.");
        } else {
            System.out.println("Failed to insert data.");
        }
    }
}