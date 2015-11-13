/**
	Questa classe implementa l'uso e la gestione di un distributore di bevande.
	Tiene traccia della quantità di lattine e gettoni contenuta.
	Permette l'acquisto di lattine e la consultazione della disponibilità di
	lattine da parte dell'utente finale; permette, inoltre, al gestore del di-
	stributore di controllare la quantità di gettoni, rifornire di lattine e
	ritirare i gettoni.
*/

// importazione librerie o classi
//import java.util.Scanner;
//import javax.swing.JOptionPane;

public class DistributoreBibite {
	/**
		Costruttori classe DistributoreBibite
		Il primo costruttore crea la classe con un numero predefinito di lattine
		già contenuto; il secondo crea la classe con un numero di lattine pari
		a quello specificato in fase di creazione.
		
		Il numero di lattine prefedinito è 100.
	*/
	public DistributoreBibite() {
		cans = 100;
		tokens = 0;
	}
	public DistributoreBibite(byte newcans) {
		cans = newcans;
		tokens = 0;
	}
	
	// metodi modificatori
	/**
	 * Il metodo per l'acquisto di una lattina in cambio di un gettone.
	 */
	public void buy() {
		// controlla se ci sono abbastanza lattine ed eventualmente restituiscine una
		if (cans > 0) {
			tokens++;
			cans--;
			System.out.printf("%n%s%n%n", "Lattina erogata.");
		}
		else System.out.printf("%n%s%n", "Bibite esaurite.");
	}
	/**
	 * Il metodo per l'acquisto di n lattine per n gettoni.
	 * @param intokens Il numero di gettoni inseriti.
	 */
	public void buy(byte intokens) {
		// controlla se ci sono abbastanza lattine ed eventualmente restituiscine quante richieste
		if (cans > 0) {
			if (intokens > 0) {
				tokens = (byte) (tokens + intokens);
				cans = (byte) (cans - intokens);
				if (intokens == 1) {
					System.out.printf("%n%s%n%n", "Lattina erogata.");
				}
				else System.out.printf("%n%3d%s%n%n", intokens, "lattine erogate.");
			}
			else System.out.printf("%n%s%n", "Non puoi aver inserito gettoni con valore negativo o nullo!");
		}
		else System.out.printf("%n%s%n", "Bibite esaurite.");
	}

	/**
	 * Il metodo per il rifornimento del distributore.
	 * Non permette il ritiro delle lattine.
	 * @param incans Il numero di lattine inserite.
	 */
	public void refillCans(byte incans) {
		// rifornisce il distributore di lattine
		if (incans > 0) {
			cans = (byte) (cans + incans);
			System.out.printf("%n%s%3d%s%n%s%3d%s%n", "Sono state inserite ", incans, " nuove lattine.", "Il distributore contiene adesso ", cans, " lattine.");
		}
		else System.out.printf("%n%s%n", "Il ritiro delle lattine gi/u00E0 presenti nel distributore /u00E8 stato disabilitato.");
	}
	
	/**
	 * Il metodo per il ritiro dei gettoni dal distributore.
	 */
	public void retrieveTokens() {
		// ritira i gettoni presenti nel distributore
		System.out.printf("%n%s%3d%s%n%s%n", "Sono stati ritirati ", tokens, " gettoni.", "Non ci sono pi\u00f9 gettoni nel distributore.");
		tokens = 0;
	}

	// metodi accesso
	/**
	 * Il metodo per la restituzione delle lattine disponibili.
	 * @return cans Il numero di lattine disponibili nel distributore.
	 */
	public byte getCans() {
		// restituisci il numero di lattine disponibile
		return cans;
	}

	/**
	 * Il metodo per la restituzione dei gettoni contenuti nel distributore.
	 * @return tokens Il numero di gettoni contenuti nel distributore.
	 */
	public byte getTokens() {
		// restituisci il numero di gettoni
		return tokens;
	}

	// variabili d'istanza
	private byte cans;
	private byte tokens;
}
