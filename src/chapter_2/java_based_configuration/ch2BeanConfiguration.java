package chapter_2.java_based_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ch2BeanConfiguration {
	@Bean
	public AccountService accountService() {
		AccountServiceImpl accountServiceImpl = new AccountServiceImpl();
		accountServiceImpl.setAccountDao(accountDao());
		return accountServiceImpl;
	}

	@Bean
	public AccountDao accountDao() {
		AccountDaoImpl beAccountDaoImpl = new AccountDaoImpl();
		return beAccountDaoImpl;
	}
}
