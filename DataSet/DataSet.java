/**
 * Serve a calcolare la media di
 * un insieme di valori numerici,
 * il minimo e il massimo
 */
public class DataSet
{
	/**
	 * Costruisce un insieme vuoto
	 */
	public DataSet()
	{
		sum = 0;
		count = 0;
		minimum = 0;
		maximum=0;
	}
	
	/**
	* Restituisce la media dei dati
	* @return la media o 0 se nessun dato è stato aggiunto
	*/
	public double getAverage()
	{
		if (count == 0)
			return 0;
		else
			return sum / count;
	}  
	/**
	* Restituisce il più grande dei dati
	* @return il massimo o 0 se nessun dato e` stato aggiunto
	*/
	public Measurable getMaximum()
	{
		return maximum;
	}
	/**
	 * Restituisce il piu` piccolo dei dati
	 * @return il minimo o 0 se nessun dato è stato aggiunto
	 */
	public Measurable getMinimum()
	{
		return minimum;
	}
	// Aggiunge un oggetto Measurable
	public void add(Measurable x)
	{
		sum = sum + x.getMeasure();
		if (count == 0 || minimum.getMeasure() > x.getMeasure())
			minimum = x;
		if (count == 0 || maximum.getMeasure() < x.getMeasure())
			maximum = x;
		count++;
	}
	
	private double sum;
	private Measurable minimum;
	private Measurable maximum;
	private int count;
}