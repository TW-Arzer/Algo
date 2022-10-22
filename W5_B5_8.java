import java.util.HashMap;
import java.util.Map;

public class W5_B5_8  {
	
	public static void main(String[] args){
		HashMap<String, Integer> mon_dictionnaire = new HashMap<String, Integer>();
		mon_dictionnaire.put("étudiants", 1400);
		mon_dictionnaire.put("enseignants", 2300);
		mon_dictionnaire.put("collaboratuers", 0);
	
		System.out.println(mon_dictionnaire.get("étudiants"));
	
		int taille_dictionnaire = mon_dictionnaire.size();
		System.out.println(taille_dictionnaire);
		
		mon_dictionnaire.put("collaboratuers", 950);
		mon_dictionnaire.put("pays", 86);
		
		for (String keys : mon_dictionnaire.keySet()){
			System.out.println(keys + ":" + mon_dictionnaire.get(keys));
		
		
		}
	
	
	}
	
}