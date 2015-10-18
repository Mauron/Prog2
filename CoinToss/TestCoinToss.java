// Questo programma simula 10 lanci di moneta
public class TestCoinToss
{
	public static void main(String[] args)
	{
		CoinToss c = new CoinToss();
		final int THROWS = 10;
		for (int i = 1; i <= THROWS; i++)
		{
			String f = c.throwcoin();
			System.out.print(f + " ");
		}
		System.out.println();
	}
}