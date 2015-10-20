import java.util.Scanner;

/**
 * Questo programma collauda la classe Tris
 * chiedendo all'utente di selezionare posizioni sulla
 * scacchiera e visualizzando il risultato.
 */
public class TrisTester
{
	public static void main(String[] args)
	{
		String player = "\u00D7";
		Tris game = new Tris();
		Scanner in = new Scanner(System.in);
		boolean done = false;
		while(!done)
		{
			System.out.println(game.toString());
			System.out.print("Inserisci una riga per " + player + " (0 per uscire): ");
			int riga = in.nextInt();
			if (riga <= 0 || riga > 3) done = true;
			else
			{
				int colonna = 0;
				do
				{
					System.out.print("Inserisci colonna per " + player + ": ");
					colonna = in.nextInt();
					if (colonna <= 0 || colonna > 3) System.out.println("Indice di colonna errato.");
				} while (colonna <= 0 || colonna > 3);
				game.set(riga, colonna, player);
				if (player.equals("\u00D7")) player = "\u25CB";
				else player = "\u00D7";
			}
		}
	}
}