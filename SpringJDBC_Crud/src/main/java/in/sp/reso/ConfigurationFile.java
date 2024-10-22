package in.sp.reso;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class ConfigurationFile {
	@Bean
	public DriverManagerDataSource mydata() {
		DriverManagerDataSource dm = new DriverManagerDataSource();
		dm.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dm.setUrl("jdbc:mysql://localhost:3306/SpringDataBase");
		dm.setUsername("root");
		dm.setPassword("root");
		return dm;

	}

	@Bean
	public JdbcTemplate jdbctemp() {

		JdbcTemplate temp = new JdbcTemplate();
		temp.setDataSource(mydata());
		return temp;
	}

}
