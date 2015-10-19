import java.io.*;
import java.util.Scanner;
class ReadAddress
{
	public static void main(String a[]) throws Exception
	{
		File usFile;
		Scanner sf;
		usFile = new File("address.txt");
		sf = new Scanner(usFile);
		while (sf.hasNextLine())
			System.out.println(sf.nextLine());
		sf.close();
	}
}