public class Investment
{
	public Investment(double aBalance, double aRate)
	{
		balance = aBalance;
		rate = aRate;
		years = 0;
	}
	public double getBalance()
	{
		return balance;
	}
	public int getYears()
	{
		return years;
	}
	//accumula interessi fino a che il target è raggiunto
	public void waitForBalance(double targetBalance)
	{
		while (balance < targetBalance) {
			years++;
			double interest = balance * rate / 100;
			balance = balance + interest;
		}
	}
	private double balance;
	private double rate;
	private int years;
}