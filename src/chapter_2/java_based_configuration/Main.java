package chapter_2.java_based_configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ch2BeanConfiguration.class);
		AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

		System.out.println("Befor Transfer");
		System.out.println("Account 1 balande:" + accountService.getAccount(1).getBalance());
		System.out.println("Account 2 balance:" + accountService.getAccount(2).getBalance());
		accountService.transferMoney(1, 2, 5.0);
		System.out.println("after transfer");
		System.out.println("Account 1 balande:" + accountService.getAccount(1).getBalance());
		System.out.println("Account 2 balance:" + accountService.getAccount(2).getBalance());

	}

}
