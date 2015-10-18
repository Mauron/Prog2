import java.util.Random;
public class CoinToss
{
	// costruttore
	public CoinToss()
	{
		faces = 2;
		generator = new Random();
	}
	
	// metodi
	public String throwcoin()
	{
		switch (1 + generator.nextInt(faces))
		{
			case 1: return "heads"; // il compilatore dà errore sui break dello switch in quanto preceduti da return
			default: return "tails";
		}
	}
	
	// variabili d'istanza
	private Random generator;
	private int faces;
}