/**
 *  A bank account has a balance that can be changed by
 *  deposits and withdrawals.
 */
public class BankAccount 
{   
	/**
	 *  Constructs a bank account with a zero balance.
	 *  @param aCustomerName the name of the owner of the bank account
	 */
	public BankAccount(String aCustomerName) 
	{
		balance = 0;
		customerName = aCustomerName;
	}

	/**
	 *  Constructs a bank account with a given balance.
	 *  @param initialBalance the initial balance
	 *  @param aCustomerName the owner of the bank account
	 */
	public BankAccount(double initialBalance, String aCustomerName)
	{
		balance = initialBalance;
		customerName = aCustomerName;
	}

	/**
     *  Deposits money into the bank account.
	 *  @param amount the amount to deposit
	 */
	public void deposit(double amount)
	{
		double newBalance = balance + amount;
		balance = newBalance;
	}

	/**
     *  Withdraws money from the bank account.
	 *  @param amount the amount to withdraw
	 */
	public void withdraw(double amount)
	{    
		double newBalance = balance - amount;
		balance = newBalance;
	} 

	/**
     *  Gets the current balance of the bank account.
	 *  @return the current balance
	 */
	public double getBalance()
	{
		return balance;
	}
	
	/**
	 * Gets the customer name for the bank account.
	 * @return the customer name
	 */
	public String getCustomerName()
	{
		return customerName;
	}

	private double balance;
	private String customerName;
} 