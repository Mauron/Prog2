// Questo programma simula 10 lanci del dado 
public class TestDice
{
	public static void main(String[] args)
	{
		Dice d = new Dice(6);
		final int THROWS = 10;
		for (int i = 1; i <= THROWS; i++)
		{
			int n = d.throwdice();
			System.out.print(n + " ");
		}
		System.out.println();
	}
}