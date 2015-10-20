/** 
 * Una scacchiera 3x3 per il gioco Tris. 
*/
public class Tris
{
/** 
Costruisce una scacchiera vuota. 
*/ 
	public Tris()
	{ 
		board = new String[ROWS][COLUMNS];
		// riempi di spazi
		for (int i = 0; i < ROWS; i++)
			for (int j = 0; j < COLUMNS; j++)
				board[i][j] = "_";
	}
	
	/**
	 * Crea una rappresentazione della scacchiera
	 * in una stringa, come ad esempio
	 * |x o|
	 * | x |
	 * | o|
	 * @return la stringa rappresentativa
	 */
	public String toString()
	{
		String r = "  ___\n"; // stampa il bordo superiore
		for (int i = 0; i < ROWS; i++)
		{
			r = r + " |";
			for (int j = 0; j < COLUMNS; j++)
				r = r + board[i][j];
			r = r + "|\n";
		}
		return r;
	}

	/**
	 * Imposta un settore della scacchiera.
	 * Il settore dev'essere libero.
	 * @param i L'indice di riga.
	 * @param j l'indice di colonna.
	 * @param player Il giocatore ("x" o "o")
	 */
	public void set(int i, int j, String player)
	{
		i--; // l'indice della scacchiera parte da 1, non da zero
		j--; 
		if (board[i][j].equals("_"))
			board[i][j] = player;
	}
	
	private String[][] board;
	private static final int ROWS = 3;
	private static final int COLUMNS = 3;
}