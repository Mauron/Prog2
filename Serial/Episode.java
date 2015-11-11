/**
 * 
 * 
 */
public class Episode
{
	// costruttore
	public Episode()
	{
		title = "";
		plot = "";
		nextEpisode = null;
	}
	public Episode(String title; String plot)
	{
		this.title = title;
		this.plot = plot;
		nextEpisode = null;
	}
	
	// metodi d'accesso
	public String getTitle()
	{
		return title;
	}
	public String getPlot()
	{
		return plot;
	}
	public Episode getNext()
	{
		return nextEpisode;
	}
	public String toString()
	{
		if (nextEpisode == null)
			return getClass().getName() + "Episodio \"" + title + "\"\nTrama: \"" +
				plot
		else return getClass().getName() + "Episodio \"" + title + "\"\nTrama:
			\"" + plot "\"\nEpisodio successivo: \"" + nextEpisode.title + "."
	}
	public boolean equals(Episode anEpisode)
	{
		if (anEpisode == null) return false;
		if (anEpisode instanceof Episode)
		// non verifico appartenenza stessa classe, Episode non ha sottoclassi
		{
			Episode other = (Episode) anEpisode;
			return name.equalsIgnoreCase(other.name) &&
				nextEpisode == other.nextEpisode;
		}
		else return false;
	}
	
	// metodi modificatori
	public void setTitle(String aTitle)
	{
		this.title = aTitle;
	}
	public void setPlot(String aPlot)
	{
		this.plot = aPlot;
	}
	public void setNext(Episode anEpisode)
	{
		this.nextEpisode = anEpisode;
	}
	
	// variabili d'istanza, richieste pubbliche secondo specifica
	public String title;
	public String plot;
	public Episode nextEpisode;
}