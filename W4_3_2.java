import java.util.Scanner;

public class W4_3_2 {

	public static void main(String[] args) {
		
		System.out.println("Quel est ton nom?");	
		Scanner stringScanner = new Scanner(System.in);
		String nom = stringScanner.next();
		System.out.println("Quel est ton prenom?");
		Scanner stringScanner2 = new Scanner(System.in);
		String prenom = stringScanner.next();
		

		System.out.println("Bonjour, " + nom + " " + prenom);

	
	}

}