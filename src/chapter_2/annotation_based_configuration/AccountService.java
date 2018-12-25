package chapter_2.annotation_based_configuration;

public interface AccountService {
	public void transferMoney(long sourceAccountId,long targetAccountId,double money);
	
	public void deposeitMoney(long accountId,double amount) throws Exception;
	
	public Account getAccount(long accountId);
}
