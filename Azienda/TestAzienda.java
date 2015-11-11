import static java.lang.System.*;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class TestAzienda
{
	public static void main(String[] args) throws FileNotFoundException
	{
		out.println("Questo programma testa la classe Azienda.\n");
		ArrayList<Dipendente> listaDipendenti = new ArrayList<>();
		Azienda unAzienda = new Azienda(listaDipendenti);
		File usFile;
		Scanner sf;
		usFile = new File("listadipendenti.txt");
		sf = new Scanner(usFile);
		out.println("Inizio lettura...");
		// int i = 0;
		while (sf.hasNextLine())
		{
			// i++;
			listaDipendenti.add(new Dipendente(sf.nextLine(), sf.nextLine(),
				sf.nextLine(), Double.parseDouble(sf.nextLine())));
			// out.println("Letto dipendente " + i);
		}
		sf.close();
		// out.println(listaDipendenti);
		out.println("Cerco i dipendenti con stipendio maggiore o uguale a 1500: ");
		ArrayList<Dipendente> listagt1500 = unAzienda.lookForPayGreaterThan(1500.);
		out.println(listagt1500);
		out.printl("Ricerca del dipendente con lo stipendio minimo...");
		out.println(unAzienda.lookForMinimumPay());
		// continua
	}
}