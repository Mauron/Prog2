/**
   A bank account has a balance that can be changed by
   deposits and withdrawals.
*/
public class BankAccount1
{
	/**
	 * Constructs a bank account with a zero balance
	 * @param anAccountNumber the account number for this account
	 */
	public BankAccount1(int accountNumber)
	{
		this.accountNumber = accountNumber;
		balance = 0;
	}

	/**
	 * Constructs a bank account with a given balance
	 * @param anAccountNumber the account number for this account
	 * @param initialBalance the initial balance
	 */
	public BankAccount1(int accountNumber, double initialBalance)
    {
		this.accountNumber = accountNumber;
		balance = initialBalance;
	}

	/**
	 * Gets the account number of this bank account.
	 * @return the account number
	 */
	public int getAccountNumber()
	{
		return accountNumber;
	}

	/**
	 * Deposits money into the bank account.
	 * @param amount the amount to deposit
	 */
	public void deposit(double amount)
	{
		double newBalance = balance + amount;
		balance = newBalance;
	}

	/**
	 * Withdraws money from the bank account.
	 * @param amount the amount to withdraw
	 */
	public void withdraw(double amount)
	{
		double newBalance = balance - amount;
		balance = newBalance;
	} 

	/**
	 * Gets the current balance of the bank account.
	 * @return the current balance
	 */
	public double getBalance()
	{
		return balance;
	} 

	private int accountNumber;
	private double balance;
}