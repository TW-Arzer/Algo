public class W5_B5_20 {
	
	public static int factoriel(int x){
	
		if (x==0){
			return 1;
		} else {
			return x * factoriel(x-1); //Factoriel(x-1), nicht nur (x-1) --> sonst nur Bsp. 5 * 4 nicht 5 * 4 * 3...
		}
	}
	
	public static void main(String[] args){
		System.out.println(factoriel(5));
	
	
	
	}
}