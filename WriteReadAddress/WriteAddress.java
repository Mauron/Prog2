import java.io.*;
public class WriteAddress
{
	public static void main(String a[]) throws Exception
	{
		File usFile;
		PrintStream usPS;
		usFile = new File("address.txt");
		usPS = new PrintStream(usFile);
		usPS.println("Universit\u00E0 di Salerno");
		usPS.println("Facolt\u00E0 di Scienze");
		usPS.println("Via Giovanni Paolo II, 132");
		usPS.println("84084 Fisciano (SA), Italia");
		usPS.close();
	}
}