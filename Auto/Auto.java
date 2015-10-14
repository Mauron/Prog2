/**
	Questa classe genera oggetti di tipo Auto caratterizzati da una marca, un nome,
	una targa, una capacità serbatoio e da un valore di Km per litro.
*/
public class Auto {
	/**
		Costruttore classe Auto
		@param marca Il produttore dell'autoveicolo.
		@param nome Il nome dell'autoveicolo.
		@param targa La targa con cui l'autoveicolo è stato immatricolato.
		@param serbatoio La capienza del serbatoio dell'autoveicolo.
		@param kmperlitro Il numero di kilometri percorribile dall'autoveicolo con un litro di carburante.
	*/
	public Auto(String marca, String nome, String targa, int serbatoio, int kmperlitro) {
		mark = marca;
		name = nome;
		plate = targa;
		fuel = serbatoio;
		kmperliter = kmperlitro;
	}
	
	// metodi
	/**
		Ottieni dati auto
	*/
	public void getData() {
		System.out.println(mark);
		System.out.println(name);
		System.out.println(plate);
		System.out.println(fuel);
		System.out.println(kmperliter);
	}
	/**
		Ottieni autonomia dell'auto
		@return getAutonomy() l'autonomia del modello selezionato
	*/
	public double getAutonomy() {
		return fuel * kmperliter;
	}
	
	// variabili d'istanza
	private String mark;
	private String name;
	private String plate;
	private int fuel;
	private int kmperliter;
}
