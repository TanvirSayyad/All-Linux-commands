package in.sm.reso;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class ConfigBy {
	@Bean
	public DriverManagerDataSource DriverManager() {
		DriverManagerDataSource source = new DriverManagerDataSource();

		source.setDriverClassName("com.mysql.cj.jdbc.Driver");
		source.setUrl("jdbc:mysql://localhost:3306/SpringDataBase");
		source.setUsername("root");
		source.setPassword("root");

		return source;

	}

	@Bean
	public NamedParameterJdbcTemplate namedparatmeter() {
		NamedParameterJdbcTemplate nmp = new NamedParameterJdbcTemplate(DriverManager());
		return nmp;

	}

}
