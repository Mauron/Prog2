import java.util.Random; 
public class Dice
{
	// costruttore che costruisce un dado
	// con s facce
	public Dice(int s)
	{
		faces = s;
		generator = new Random();
	}
	
	public int throwdice()
	{
		return 1 + generator.nextInt(faces);
	}
	
	private Random generator;
	private int faces;
}