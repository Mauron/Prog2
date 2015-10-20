import java.util.ArrayList;

/**
 * This program tests the ArrayList class.
 */
public class ArrayListTester
{
	public static void main(String[] args)
	{
		ArrayList<BankAccount1> accounts = new ArrayList<BankAccount1>();
		accounts.add(new BankAccount1(1001));
		accounts.add(new BankAccount1(1015));
		accounts.add(new BankAccount1(1729));
		accounts.add(1, new BankAccount1(1008));
		accounts.remove(0);

		System.out.println("Size: " + accounts.size());
		BankAccount1 first = accounts.get(0);
		System.out.println("First account number: " + first.getAccountNumber());
		BankAccount1 last = accounts.get(accounts.size() - 1);
		System.out.println("Last account number: " + last.getAccountNumber());
	}
}