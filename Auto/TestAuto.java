public class TestAuto {
	public static void main(String[] args) {
		Auto NihonSupido = new Auto("Nihon", "Supido", "JA001AA", 40, 12);
		System.out.println("\n" + "Nuova auto:");
		NihonSupido.getData();
		Auto NihonTsubo = new Auto("Nihon", "Tsubo", "JA002AA", 50, 20);
		System.out.println("\n" + "Nuova auto:");
		NihonTsubo.getData();
		System.out.println("\n" + "Autonomia Nihon Supido: " + NihonSupido.getAutonomy());
		System.out.println("Autonomia Nihon Tsubo: " + NihonTsubo.getAutonomy() + "\n");
	}
}
