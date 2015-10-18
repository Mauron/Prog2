import java.util.Scanner; 
public class SommaInput1
{
	public static void main(String[] args)
	{
		double somma=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Immetti valore oppure Q per uscire");
		boolean done = false;
		while (!done)
		{
			String input = in.next();
			if (input.equalsIgnoreCase("Q"))
				done = true;
			else
			{
				double x = Double.parseDouble(input);
				somma+=x;
			}
		}
		System.out.println("la somma \u00E8:"+ somma);
	}
}