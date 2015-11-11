public class Dipendente
{
	// costruttore Dipendente
	public Dipendente(String aSurname, String aName, String anID, double aPay)
	{
		surname = aSurname;
		name = aName;
		ID = anID;
		pay = aPay;
	}
	
	// metodi d'accesso
	public String getSurname()
	{
		return surname;
	}
	public String getName()
	{
		return name;
	}
	public String getID()
	{
		return ID;
	}
	public double getPay()
	{
		return pay;
	}
	public String toString()
	{
		return "\nCognome: " + surname + "\nNome: " + name +
		 "\nCodice fiscale: " + ID + "\nSalario: " + pay + "\n";
	}
	
	// metodi modificatori
	public void setPay(double percentage)
	{
		pay += (pay*percentage)/100;
	}
	
	// variabili d'istanza
	private String surname;
	private String name;
	private String ID;
	private double pay;
}