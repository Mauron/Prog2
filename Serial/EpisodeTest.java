public class EpisodeTester
{
	public static void main (String[] args)
	{
		System.out.println("Questo programma testa la classe Episode");
		System.out.println("Creazione primo episodio...");
		Episode ep1 = new Episode("Introduzione" + "Questo e' l\'episodio introduttivo della serie");
		System.out.println(ep1);
		System.out.println("Creazione secondo episodio...");
		Episode ep2 = new Episode("Secondo" + "Questo è il secondo episodio della serie");
		ep1.nextEpisode == ep2 // posso farlo, var. istanza pubbliche
		System.out.println(ep1);
		System.out.println(ep2);
		Episode ep3 = new Episode("Introduzione" + "Questo è il terzo episodio della serie");
		ep3.nextEpisode == ep2;
		System.out.println("Confronto episodi 1 e 2 (mi aspetto FALSE)" +
			ep1.equals(ep2));
		System.out.println("Confronto episodi 2 e 3 (mi aspetto FALSE)" +
			ep2.equals(ep3));
		System.out.println("Confronto episodi 1 e 3 (mi aspetto TRUE)" +
			ep1.equals(ep3));
		System.out.println("Fine programma.");
	}
}