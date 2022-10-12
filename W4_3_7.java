public class W4_3_7 {
	
	public static void main(String[] args) {
	
		float nb_bonbons = 11;
		float nb_personnes = 3;
		float bonbons_personnes = nb_bonbons / nb_personnes;
		float bonbons_reste = nb_bonbons % nb_personnes;
		
		System.out.println(bonbons_personnes + " " + bonbons_reste);
	
		++nb_bonbons;
		--nb_personnes;
		float bonbons_personnes2 = nb_bonbons / nb_personnes;
		float bonbons_reste2 = nb_bonbons % nb_personnes;
		
		System.out.println(bonbons_personnes2 + " " + bonbons_reste2);
	
	
	
	}
	
}