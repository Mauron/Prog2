import java.util.Scanner; 
/**
 * This program prints a description of an earthquake of a given 
 * magnitude.
 */
public class EarthquakeRunner 
{
	public static void main(String[] args) 
	{
		System.out.println("Questo programma fornisce una descrizione dell\u00B4entit\u00E0 di un terremoto in base alla scala Richter.");
		System.out.println("Sar\u00E0 specificato dal sistema un valore di prova: 2,5.");
		double magnitude = 2.5; // nel codice, il separatore di decimali è il punto mentre da input dipende dalla localizzazione del sistema dell'utente
		Earthquake quake = new Earthquake(magnitude);
		System.out.println(quake.getDescription());
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a magnitude on the Richter scale: ");
		magnitude = in.nextDouble();
		quake = new Earthquake(magnitude);
		System.out.println(quake.getDescription());
	}
}