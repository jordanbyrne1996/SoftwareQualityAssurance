
public class Indentation {

	// this is an example of how we DO NOT use indentation
	public boolean typeOne() {
		int x = 0;
		int y = 0;
		int z = 0;
		if (x < 17 && y < 22 || z < 60) {
			return true;
		} else {
			System.out.println("incorrect");
			return false;
		}

	}

	//this is an example of how we DO use indentation
	public boolean typeTwo(){
		int x = 0;
		int y = 0;
		int z = 0;
		
		if (x < 17 && y < 22 ||  z< 60) 
		{
		 	return true; 
		}
		 else 
		{ 
			System.out.println("incorrect");
			
			return false; 
		} 

	}

}
