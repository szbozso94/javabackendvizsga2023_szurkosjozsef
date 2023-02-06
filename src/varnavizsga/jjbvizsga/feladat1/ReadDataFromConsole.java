package varnavizsga.jjbvizsga.feladat1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadDataFromConsole {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Kérem adja meg a könyv adatait: ");
		System.out.println("Kérem adja meg a könyv szerzőjét(szöveg): ");
		String author = new String();
		System.out.println("Kérem adja meg a könyv címét(szöveg): ");
		String title = new String();
		System.out.println("Kérem adja meg a könyv árát áfával(egész szám legyen): ");
		
	}

}
