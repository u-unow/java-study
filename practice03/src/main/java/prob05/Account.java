package prob05;

public class Account {
	private String accountNo;
	private int balance;
	private int save;
	private int deposit;
	
	
	public Account(int balance) {
		this.balance = balance;
	}
	public Account(String accountNo) {
		this.accountNo = accountNo;
	}
	public void save(int i) {
		balance =balance + i;
		System.out.println(accountNo+" 계좌에 "+balance+"만원이 입금되었습니다.");

	}
	public void deposit(int i) {
		balance = balance-i;
		System.out.println(accountNo+" 계좌에 "+i+"만원이 출금되었습니다.");

	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String account) {
		this.accountNo = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getSave() {
		return save;
	}

	public void setSave(int save) {
		this.save = save;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	

}
