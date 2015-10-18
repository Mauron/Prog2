import java.util.Scanner; 
public class SommaInput2
{
	public static void main(String[] args)
	{
		double somma=0;
		String input;
		Scanner in = new Scanner(System.in);
		System.out.println("Immetti valore oppure Q per uscire");
		while (!(input = in.next()).equalsIgnoreCase("Q"))
		{
			double x = Double.parseDouble(input);
			somma+=x;
		}
		System.out.println("la somma \u00E8:"+ somma);
	}
}