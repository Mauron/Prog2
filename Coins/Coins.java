// importazione librerie o classi
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Coins {
	public static void main(String[] args) {
		// dichiarazione costanti
		final float PENNY_VALUE = 0.01F;
		final float NICKEL_VALUE = 0.05F;
		final float DIME_VALUE = 0.1F;
		final float QUARTER_VALUE = 0.25F;

		JOptionPane.showMessageDialog(null, "Benvenuto!");
		Scanner in = new Scanner(System.in);
		System.out.print("\nQuanti penny hai? ");
		String input = JOptionPane.showInputDialog("Quanti penny hai?");
		// int pennies = in.nextInt();
		byte pennies = Byte.parseByte(input);
		if (pennies == 2) {
			System.out.printf("%n%s%3d%s%n%s%n", "E cos\u00EC tu hai ", pennies, " penny?!", "Eccellente!");
			JOptionPane.showMessageDialog(null, "E cos\u00EC tu hai " + pennies + " penny?!\nEccellente!");
		}
		else {
			System.out.printf("%n%s%3d%s%n", "Hai ", pennies, " penny.");
			JOptionPane.showMessageDialog(null, "Hai " + pennies + " penny.");
		}
		System.out.print("\nQuanti nickel hai? ");
		input = JOptionPane.showInputDialog("Quanti nickel hai?");
		// int nickels = in.nextInt();
		byte nickels = Byte.parseByte(input);
		System.out.printf("%n%s%3d%s%n", "Hai ", nickels, " nickel.");
		JOptionPane.showMessageDialog(null, "Hai " + nickels + " nickel.");
        System.out.print("\nQuanti dime hai? ");
		input = JOptionPane.showInputDialog("Quanti dime hai?");
        // int dimes = in.nextInt();
		byte dimes = Byte.parseByte(input);
		System.out.printf("%n%s%3d%s%n", "Hai ", dimes, " dime.");
		JOptionPane.showMessageDialog(null, "Hai " + dimes + " dime.");
        System.out.print("\nQuanti quarter hai? ");
		input = JOptionPane.showInputDialog("Quanti quarter hai?");
        // int quarters = in.nextInt();
		byte quarters = Byte.parseByte(input);
		System.out.printf("%n%s%3d%s%n", "Hai ", quarters, " quarter.");
		JOptionPane.showMessageDialog(null, "Hai " + quarters + " quarter.");
		
        // calcolo del valore complessivo in dollari delle monete possedute 
		double total = pennies * PENNY_VALUE 
						+ nickels * NICKEL_VALUE 
						+ dimes * DIME_VALUE 
						+ quarters * QUARTER_VALUE; 

		// valore totale delle monete
        System.out.printf("%n%n%s%5.2f%s%n%n", "Hai in totale ", total, " dollari.");
		JOptionPane.showMessageDialog(null, "Hai in totale " + total + " dollari.");
		JOptionPane.showMessageDialog(null, "Arrivederci!");
		System.exit(0); // uscita con codice di stato
   } //chiude il corpo del main
} //chiude la definizione della classe
