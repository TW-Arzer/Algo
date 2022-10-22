public class W5_4_4 {
	
	public static void division(float a, float b) throws ArithmeticException{

		if(b==0){
			throw new ArithmeticException("Nous ne pouvons pas effectuer une division par 0");
		}
		
		else{
			float result = a / b;
			System.out.println("Le résultat de la division de " + a + "/" + b + "=" + result);
			
		}

	}
				
		
		
	public static void main(String args[]){
		float value1 = 2;
		float value2 = 4;
		try {
			division(value1,value2);
			value2 = 0; 				//Value2 darf nicht 0 sein, sonst ArithmeticException
			division(value1,value2);
		}
		
		catch(IndexOutOfBoundsException err){ //braucht es nicht, da IndexOutOfBoundsException nicht möglich ist hier
			System.out.println("Nous ne pouvons pas effectuer une division par 0"); //Somit auch das hinfällig
			
		}
	

	}
		

}