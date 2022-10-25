import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class W5_B5_17 {
	
	public static void main(String[] args){
	
		List<Integer> nombres = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10));
		Iterator<Integer> i = nombres.iterator();
		
		while(i.hasNext()) {
			if(i.next()%2==1){
				i.remove();
			}
		}
		
		System.out.println(nombres);
	}

}