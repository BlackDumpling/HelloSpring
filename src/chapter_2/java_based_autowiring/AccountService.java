package chapter_2.java_based_autowiring;

public interface AccountService {
	public void transferMoney(long sourceAccountId,long targetAccountId,double money);
	
	public void deposeitMoney(long accountId,double amount) throws Exception;
	
	public Account getAccount(long accountId);
}
