import java.util.Scanner;

public class DataSetTest
{
	public static void main(String[ ] args)
	{
		Scanner input = new Scanner(System.in);
		DataSet ds = new DataSet();
		boolean done = false;
		while (!done)
		{
			String x = input.nextLine();
			if (x.equalsIgnoreCase("fine") )
				done = true;
			else
				ds.add(null); // al posto di null va aggiunto un oggetto Measurable
		}
		System.out.println("la media e`:"+ ds.getAverage());
		input.close();
	}
}