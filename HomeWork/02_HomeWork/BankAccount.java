
public class BankAccount {

	private String accountName;
	private String accountNum;
	private double balance;
	private boolean isOverDraftAllowed;
	private double overDraftSum;

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isOverDraftAllowed() {
		return isOverDraftAllowed;
	}

	public void setOverDraftAllowed(boolean isOverDraftAllowed) {
		this.isOverDraftAllowed = isOverDraftAllowed;
	}

	public double getOverDraftSum() {
		return overDraftSum;
	}

	public void setOverDraftSum(double overDraftSum) {
		this.overDraftSum = overDraftSum;
	}

	public BankAccount() {
		super();
		this.accountName = "Account";
		this.accountNum = "00001";
		this.isOverDraftAllowed = false;
		this.balance = 0;
		this.overDraftSum = 0;

	}

	public BankAccount(String accountName, String accountNum, double balance, boolean isOverDraftAllowed,
			double overDraftSum) {
		super();
		this.accountName = accountName;
		this.accountNum = accountNum;
		this.balance = balance;
		this.isOverDraftAllowed = isOverDraftAllowed;
		this.overDraftSum = overDraftSum;
	}

	public void Deposit(double addToBalance) {
		if (addToBalance > 0) {
			balance += addToBalance;
		} else {
			System.out.println("Enter higher then 0, and try again!");
		}
	}

	public void Withdrawal(double WithdrawAmount) {
		
		if (WithdrawAmount>0) {
			
			if (balance - WithdrawAmount > 0) {
					balance -= WithdrawAmount;
			}	else {
				
				if (isOverDraftAllowed) {
					 if (WithdrawAmount > (balance + overDraftSum)) {
						 System.out.println("Cant Withdraw This Much! Enter Less");
						 System.out.println("------------------------");
					} else {
						balance -= WithdrawAmount;

					}
					
					
				} else {
					System.out.println("Cant Withdraw this Much, enter less!");
					 System.out.println("------------------------");

				}
			}
			
				
		} else {
			System.out.println("Enter a Positive Number!");
		}
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n" + "Account Name is " + accountName + "\n" + "Account number is " + accountNum
				+ "\n" + "Balance is " + balance + "\n" + "OverDraft allowed? " + isOverDraftAllowed + "\n"
				+ "how Much allowed? " + overDraftSum + "\n------------------------";
	}

}
