package level3;

public class HandlingExceptions {

	public static void main(String[] args) throws ArithmeticException{
		int x=100;
		int y=0;
		float z=0.0f;
		
		try{
			 z = x/y;	
		}catch(ArithmeticException aExp){
			System.out.println(aExp);
		}
		
		System.out.println(z);
	}

}
