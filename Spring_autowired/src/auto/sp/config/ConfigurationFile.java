package auto.sp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import auto.sp.bean.Address;
import auto.sp.bean.Student;

@Configuration
public class ConfigurationFile {

	@Bean
	public Address createAddress() { // Renamed for clarity
		Address address = new Address(); // Ensure Address class is properly defined
		address.setCity("Pune");
		address.setPin(411052);
		return address;
	}
@Bean
	public Student StInfro() {

		Student st = new Student();
		st.setStid(1);
		st.setName("Tanvir");
		return st;
	}
}
