import java.util.Scanner;
import java.lang.Math;

public class W4_4_3 {
	
	public static void main(String[] args) {
		
		System.out.println("Rayon?");
		Scanner FloatScanner = new Scanner(System.in);
		Float Rayon = FloatScanner.nextFloat();
		
		System.out.println("Aire est: " + Aire(Rayon));		
		System.out.println("Perimetre est: " + Perimetre(Rayon));
	
	}
	
	
	static double Aire(double Rayon) {
	
		return Rayon * Rayon * Math.PI;
	}	


	static double Perimetre(double Rayon) {
		
		return 2 * Rayon * Math.PI;
		
	}


}