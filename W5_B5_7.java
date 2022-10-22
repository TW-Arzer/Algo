import java.util.List;
import java.util.LinkedList;

public class W5_B5_7{

	public static void main(String[] args){
		
		List ma_liste = List.of(1,2,3,4,5);
		LinkedList ma_liste_m = new LinkedList(ma_liste);
		ma_liste_m.addFirst(0);
		ma_liste_m.addLast(6);
		
	for(int i=0;i<ma_liste_m.size();i++){
		System.out.println(ma_liste_m.get(i));
		
	}
		
	
	}
	

}