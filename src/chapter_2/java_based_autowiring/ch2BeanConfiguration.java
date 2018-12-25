package chapter_2.java_based_autowiring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ch2BeanConfiguration {
	@Bean
	public AccountService accountService() {
		AccountServiceImpl accountServiceImpl = new AccountServiceImpl();
		return accountServiceImpl;
	}

	@Bean
	@Qualifier
	public AccountDao accountDao() {
		AccountDaoMemImpl beAccountDaoImpl = new AccountDaoMemImpl();
		return beAccountDaoImpl;
	}
	@Bean
	public AccountDao accountDaoJdbc() {
		AccountDaoJdbcImpl bean = new AccountDaoJdbcImpl();
		return bean;
	}
}
