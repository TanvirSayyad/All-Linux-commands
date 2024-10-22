package in.sp.reso;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfig {

	@Bean
	public Address createAddobje() {

		Address addr = new Address();
		addr.setCity("Pune");
		addr.setNo(1);
		addr.setPin(1234);
		return addr;

	}

	@Bean
	public Student Stud() {

		Student st = new Student();
		st.setName("Tanvir");
		st.setRoll(23);
		st.setAddress(createAddobje());

		return st;

	}
}
