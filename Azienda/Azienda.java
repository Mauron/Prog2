import java.util.ArrayList;

public class Azienda
{
	// costruttore di Azienda
	public Azienda(ArrayList<Dipendente> unaListaDipendenti)
	{
		listaDipendenti = unaListaDipendenti;
	}
	
	// metodi d'accesso
	public ArrayList<Dipendente> getList()
	{
		return listaDipendenti;
	}
	public ArrayList<Dipendente> lookForPayGreaterThan(double aPay)
	{
		ArrayList<Dipendente> lista = new ArrayList<>();
		for (Dipendente employee: listaDipendenti)
		{
			if (employee.getPay() >= aPay)
				lista.add(employee);
		}
		return lista;
	}
	public ArrayList<Dipendente> lookForName(String key)
	{
		ArrayList<Dipendente> lista = new ArrayList<>();
		for (Dipendente employee: listaDipendenti)
		{
			if (employee.getSurname().equalsIgnoreCase(key) ||
				employee.getName().equalsIgnoreCase(key))
					lista.add(employee);
		}
		return lista;
	}
	public Dipendente lookForMinimumPay()
	{
		//double minimum = listaDipendenti.get(0).getPay();
		Dipendente poveraccio = listaDipendenti.get(0);
		for (Dipendente employee: listaDipendenti)
		{
			if (employee.getPay() < poveraccio.getPay()) // getPay() < minimum
				// minimum = employee.getPay();
				poveraccio = employee;
		}
		return poveraccio;
	}
	
	// metodi modificatori
	public void increaseWagesBy(double aPercentage)
	{
		
	}
	
	// variabili d'istanza
	private ArrayList<Dipendente> listaDipendenti;
}