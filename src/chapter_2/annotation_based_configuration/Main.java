package chapter_2.annotation_based_configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("/chapter_2/annotation_based_configuration/ch2-beans.xml");
		AccountService accountService = applicationContext.getBean("accountServiceImpl", AccountService.class);

		System.out.println("Befor Transfer");
		System.out.println("Account 1 balande:" + accountService.getAccount(1).getBalance());
		System.out.println("Account 2 balance:" + accountService.getAccount(2).getBalance());
		accountService.transferMoney(1, 2, 5.0);
		System.out.println("after transfer");
		System.out.println("Account 1 balande:" + accountService.getAccount(1).getBalance());
		System.out.println("Account 2 balance:" + accountService.getAccount(2).getBalance());

	}

}
