/**
	Classe test per la classe DistributoreBibite.
*/
// importazione classi
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TestDistributoreBibite {
	public static void main(String[] args) {
		System.out.println("\nBenvenuto!\nQuesto programma crea dei distributori e ne gestisce l'erogazione delle bibite contenute inserendo dei gettoni,"
				+ " per ognuno dei quali viene restituita una lattina.");
		DistributoreBibite distr1 = new DistributoreBibite();
		System.out.println("\u0000C8 stato creato un nuovo distributore con" + distr1.getCans() + "lattine.");
		System.out.println("(Mi aspetto 100 lattine.)\n");
		distr1.buy();
		System.out.println("Ho comprato una bibita; nel distributore restano" + distr1.getCans() + "bibite.");
		System.out.println("(Mi aspetto 99 bibite.)");
		distr1.refillCans(10);
		System.out.println("Passa il gestore del distributore ed inserisce 10 bibite.\nSono adesso presenti " + distr1.getCans() + " bibite.");
		System.out.println("(Mi aspetto 109 lattine.)");
		distr1.buy(10);
		System.out.println("Ho comprato 10 bibita; nel distributore restano" + distr1.getCans() + "bibite.");
		System.out.println("(Mi aspetto 99 bibite.)");
		System.out.println("Passa il gestore del distributore per il ritiro dei gettoni.\nCi sono " + distr1.getTokens());
	}
}